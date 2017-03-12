/*
 * Andrew Parise
 * 3/30/16
 * Assignment 7.1
 * 
 * ObjColorPair.java
 * 
 * Class Overview:
 * Node object to be used in ChildrenGame.java class for linking the two strings for storage in the linkedList
 * 
 */
public class ObjColorPair {
	private String _objectName, _colorName;
	

	public ObjColorPair(String objName, String colName){
		_objectName = objName;
		_colorName = colName;
	}
	//toString
	public String toString(){
		//returns a string containing the [object name, color name]
		return "[" + getObjName() + ", " + getColorName() + "]";
	}
	
	//Sets/Gets
	public void setObjName(String val){
		_objectName = val;
	}
	public void setColorName(String val){
		_colorName = val;
	}
	public String getObjName(){
		return _objectName;
	}
	public String getColorName(){
		return _colorName;
	}
}
