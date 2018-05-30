package com.parisesoftware.model;

/*
 * @author 	Andrew Parise
 * @since 	3/30/16
 * @version	5/30/18
 *
 * Node object to be used in ChildrenGame.java class for linking the two strings for storage in the linkedList
 *
 */
public class ObjColorPair {

	private String objectName;
    private String colorName;

    /**
     * Default Constructor
     *
     * @param objName Name of the Object
     * @param colName Name of the Color
     */
	public ObjColorPair(String objName, String colName){
		objectName = objName;
		colorName = colName;
	}

    /**
     * @return a string containing the [object name, color name]
     */
	public String toString(){
		return "[" + getObjName() + ", " + getColorName() + "]";
	}

	//Sets/Gets
	public void setObjName(String val){
		objectName = val;
	}
	public void setColorName(String val){
		colorName = val;
	}
	public String getObjName(){
		return objectName;
	}
	public String getColorName(){
		return colorName;
	}
}
