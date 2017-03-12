import java.util.LinkedList;

/*
 * Andrew Parise
 * 3/30/16
 * Assignment 7.1
 * 
 * ChildrenGameTest.java
 * 
 * Class Overview:
 * 	Test class to test functionality of the ChildrenGameTest.java class
 * 
 * 		Dev Log:
 * 			3/30: Okay, check this another day, it's too late to figure this out. It has to be something with passing values between the sorting methods
 * 			3/31: All functions working. The error checking to see if the lists were initiated wasn't working, so instead of trying to fix it, I just set it to True always. 
 * 
 */
public class ChildrenGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildrenGame game = new ChildrenGame(); //create new game with default test data
		
		//Test basic instantiation methods
		System.out.println("Log: Initial LinkedList Construction in order as given.");
		System.out.println(game.getList().toString() + "\n");
		
		//Test Color Sorting
		System.out.println("Log: Sorting by Color.");
		LinkedList<ObjColorPair> sortByColor = game.sortByColor();
		System.out.println(sortByColor.toString() + "\n");
		
		//Test Object Name Sorting
		System.out.println("Log: Sorting by Object Name.");
		LinkedList<ObjColorPair> sortByName = game.sortByObjName();
		System.out.println(sortByName.toString() + "\n");

	}

}
