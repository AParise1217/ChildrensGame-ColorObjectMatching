/*
 * Andrew Parise
 * 3/30/2016
 * Assignment 7.1
 * 
 * Assignment Overview:
 * 	You are assigned the job of creating the data structures for a small children's game. 
 * 	To do this you should create an array list of 10 color words and another of 10 names of objects. 
 * 	There should be one object for each of the color words. Write a program that reads from the two lists, 
 * 	and stores the 20 items in a linked list. Sort and display the linked list in ascending alphabetical order.
 * 
 * 	Dev Log:
 * 		3/30: initial
 * 		3/31: Fixed the sorting methods- error checking wasn't working.
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Pattern;



public class ChildrenGame {
	//init
	public ArrayList<String> colorList; //holds the color name strings
	public ArrayList<String> objNameList; //holds the object name strings
	public LinkedList<ObjColorPair> pairingsList;
	
	private boolean _mergeArrsHasCalled = true; //used so that functions can't be called on an unpopulated list
	private boolean _hasConstructed = true; //same as above, except for object instantiation
	
	public String _colorNames = "";
	public String _objNames = "";
	
	
	public ChildrenGame(){
		//default constructor
		_colorNames = "Red Orange Yellow Green Blue Purple Black White Silver Gold";
		_objNames = "Roses Sunset Sun Grass Sky Eggplant Coal Wedding_Dress Silverwear Ring";		
	
		_hasConstructed = true;
		init();
	}
	public ChildrenGame(String colNames, String objNames){
		//other constructor for providing the strings
		_colorNames = colNames;
		_objNames = objNames;
	
		_hasConstructed = true;
		init();
	}
	public boolean init(){
		//Handles populating the arraylists and the linked list, ready to be sorted
		if(hasConstructed()){
			//^^used for error checking, makes sure the object exists before referencing it
			colorList = populateArrList(_colorNames); //create an array list of 10 color words
			objNameList = populateArrList(_objNames); //create an array list of 10 object name words
			
			pairingsList = mergeArrs(colorList, objNameList); //reads from the two lists, and stores the 20 items in a linked list		
			return true;
		}
		return false;
	}
	public boolean hasConstructed(){ //used for error checking. makes sure user creates object before referencing methods
		return _hasConstructed;
	}
	
	public ArrayList<String> populateArrList(String list){
		//takes a string of a list, tokenizes and stores in an array list that is returned
		ArrayList<String> tempArr = new ArrayList<String>(10);
		
		final String[] tokenizedList = list.split(Pattern.quote(" ")); //tokenize string into list of strings
		
		for(int i = 0; (i < tokenizedList.length || tokenizedList.length < 10); i++){ 
			//add to arraylist dynamically, or until 10 is reached
			tempArr.add(tokenizedList[i]);
		}		
		return tempArr;
	}
	
	public LinkedList<ObjColorPair> mergeArrs(ArrayList<String> colList, ArrayList<String> objList){
		//Takes two arrayists as type String and merges them into an arraylist as type (String, String)
		LinkedList<ObjColorPair> tempList = new LinkedList<ObjColorPair>(); 
		for(int i = 0; (i < colList.size() || i < objList.size()); i++){
			ObjColorPair tempObj = new ObjColorPair(colList.get(i), objList.get(i));
			tempList.add(tempObj);
		}
		return tempList;
	}
	//Sort the linked list in ascending alphabetical order by color name
	public LinkedList<ObjColorPair> sortByColor(){
		//Sorts the linked list based off of color name
		LinkedList<ObjColorPair> retLL = getList();
		if(mergeArrsHasCalled()){
			//^^makes sure that user doesn't call this function until the other functions are instantiated
			
			Collections.sort(retLL, new NameComparator());
			
		}
		return retLL;

	}
	
	//Sort the linked list in ascending alphabetical order by object name
	public LinkedList<ObjColorPair> sortByObjName(){
		//Sorts the linked list based off of object name
		LinkedList<ObjColorPair> retLL = getList();

		if(mergeArrsHasCalled()){
			//^^makes sure that user doesn't call this function until the other functions are instantiated
			Collections.sort(retLL, new ColorComparator());
		}
		return retLL;

	}
	private boolean mergeArrsHasCalled(){
		//used for error checking to make sure user doesn't mess up flow of program
		return _mergeArrsHasCalled;
	}
	public LinkedList<ObjColorPair> getList(){
		//returns the linked list for error checking/display
		return pairingsList;
	}
	public String toString(LinkedList<ObjColorPair> linkedList){
		//returns a string containing the information on every element of the linked list
		String retVal = "[";
		for(int i = 0; i < linkedList.size(); i++){
			retVal += linkedList.get(i).toString();
		}
		retVal += "]";
		return retVal;
	}


}
