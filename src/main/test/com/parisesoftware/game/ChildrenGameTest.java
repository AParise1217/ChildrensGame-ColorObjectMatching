package com.parisesoftware.game;

import com.parisesoftware.model.ObjColorPair;

import java.util.LinkedList;

/*
 * @author	Andrew Parise
 * @since	3/30/16
 * @version	5/30/18
 *
 * Class Overview:
 * 	Test class to test functionality of the ChildrenGameTest.java class
 */
public class ChildrenGameTest {

	public static void main(String[] args) {

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
		LinkedList<ObjColorPair> sortByName = game.sortByObjectName();
		System.out.println(sortByName.toString() + "\n");

	}

}
