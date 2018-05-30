package com.parisesoftware.game;

import com.parisesoftware.mapper.IStringToArrayMapper;
import com.parisesoftware.mapper.StringToArrayMapper;
import com.parisesoftware.model.ObjColorPair;
import com.parisesoftware.comparator.ColorComparator;
import com.parisesoftware.comparator.NameComparator;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @author 	Andrew Parise
 * @since 	3/30/16
 * @version	5/30/18
 *
 */
public class ChildrenGame {

	private LinkedList<ObjColorPair> pairingsList;

	private boolean hasMergeArrayBeenCalled; //used so that functions can't be called on an unpopulated list
	private boolean hasConstructed; //same as above, except for object instantiation

	private String colorNames;
	private String objNames;


    /**
     * Default Constructor
     */
	public ChildrenGame(){
		//default constructor
		colorNames = "Red Orange Yellow Green Blue Purple Black White Silver Gold";
		objNames = "Roses Sunset Sun Grass Sky Eggplant Coal Wedding_Dress Silverwear Ring";

		hasConstructed = true;
		hasMergeArrayBeenCalled = true;
		init();
	}

    /**
     * Populates the Arrays and the LinkedList, readies them to be sorted
     */
	private void init(){
        //makes sure the object exists before referencing it
        if(hasConstructed()){
			ArrayList<String> colorList = populateArrList(colorNames);
			ArrayList<String> objNameList = populateArrList(objNames);

			pairingsList = mergeArrays(colorList, objNameList); //reads from the two lists, and stores the 20 items in a linked list
		}
	}

    /**
     * Checks whether user created object before referencing methods
     * @return boolean
     */
	private boolean hasConstructed(){
		return hasConstructed;
	}

    /**
     * @param list List to be tokenized, and stored in an Array
     * @return ArrayList version of String passed in
     */
	private ArrayList<String> populateArrList(String list){
        IStringToArrayMapper mapper = new StringToArrayMapper();
        return mapper.convertToArray(list, " ");
	}

    /**
     * @param colList List of Colors
     * @param objList List of Objects
     * @return LinkedList version of the two arrays
     */
	private LinkedList<ObjColorPair> mergeArrays(ArrayList<String> colList, ArrayList<String> objList){
		LinkedList<ObjColorPair> tempList = new LinkedList<>();
		for(int i = 0; (i < colList.size() || i < objList.size()); i++){
			ObjColorPair tempObj = new ObjColorPair(colList.get(i), objList.get(i));
			tempList.add(tempObj);
		}
		return tempList;
	}

    /**
     * Sorts the linked list in ascending alphabetical order by color name
     * @return the sorted list
     */
	public LinkedList<ObjColorPair> sortByColor(){
		//Sorts the linked list based off of color name
		LinkedList<ObjColorPair> retLL = getList();
		if(mergeArraysHasCalled()){
			retLL.sort(new NameComparator());
		}
		return retLL;
	}

    /**
     * Sorts the linked list in ascending alphabetical order by object name
     * @return the sorted list
     */
	public LinkedList<ObjColorPair> sortByObjectName(){
		LinkedList<ObjColorPair> retLL = getList();
		if(mergeArraysHasCalled()){
			retLL.sort(new ColorComparator());
		}
		return retLL;
	}

    /**
     * @return boolean representation of if the arrays have been merged or not
     */
	private boolean mergeArraysHasCalled(){
		return hasMergeArrayBeenCalled;
	}

    /**
     * @return the linked list for error checking/display
     */
	public LinkedList<ObjColorPair> getList(){
		//returns
		return pairingsList;
	}

}
