package com.parisesoftware.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 */
public class StringToArrayMapper implements IStringToArrayMapper{

    /**
     * Default Constructor
     */
    public StringToArrayMapper(){}

    /**
     * @param inputString List to be tokenized, and stored in an Array
     * @param splitPattern regex pattern to tokenize string from
     * @return ArrayList version of String passed in
     */
    public ArrayList<String> convertToArray(String inputString, String splitPattern){

        //tokenize string into list of strings
        String[] tokenizedList = inputString.split(Pattern.quote(splitPattern));

        return new ArrayList<>(Arrays.asList(tokenizedList));
    }

}
