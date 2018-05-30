package com.parisesoftware.comparator;

import com.parisesoftware.model.ObjColorPair;

import java.util.Comparator;

/*
 * @author	Andrew Parise
 * @since	3/30/16
 * @version	5/30/18
 *
 * 	Utilizes the Comparator built into the java collections so
 * 	that it supports sorting based off of the "_colorName" property of the ObjColorPair.java class
 */
public class ColorComparator implements Comparator<ObjColorPair>{

	public int compare(ObjColorPair o1, ObjColorPair o2){
		return o1.getColorName().compareTo(o2.getColorName());
	}

}
