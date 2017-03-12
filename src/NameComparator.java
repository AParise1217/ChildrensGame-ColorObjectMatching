import java.util.Comparator;

/*
 * Andrew Parise
 * 3/30/16
 * Assignment 7.1
 * 
 * NameComparator.java
 * 
 * Class Overview:
 * 	Utilizes the Comparator built into the java collections so 
 * 	that it supports sorting based off of the "_colorName" property of the ObjColorPair.java class
 * 
 * 	Dev Log:
 * 		3/30: Doesn't appear to be working, hmm
 */
public class NameComparator implements Comparator<ObjColorPair>{
	public int compare(ObjColorPair o1, ObjColorPair o2){
		return o1.getObjName().compareTo(o2.getObjName());
	}
}
