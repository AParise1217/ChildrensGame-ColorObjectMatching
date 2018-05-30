package com.parisesoftware.mapper;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StringToArrayMapperTest {

    @Test
    public void convertToArrayShouldConvertWithSpacePattern() {
        // given this data
        String testPattern = " ";
        String testList = "one two three";

        // when this occurs
        StringToArrayMapper mapper = new StringToArrayMapper();

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("one");
        expectedResult.add("two");
        expectedResult.add("three");

        // I expect this
        assertEquals(mapper.convertToArray(testList, testPattern), expectedResult);
    }

    @Test
    public void convertToArrayShouldConvertWithCommaPattern() {
        // given this data
        String testPattern = ",";
        String testList = "one,two,three";

        // when this occurs
        StringToArrayMapper mapper = new StringToArrayMapper();

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("one");
        expectedResult.add("two");
        expectedResult.add("three");

        // I expect this
        assertEquals(mapper.convertToArray(testList, testPattern), expectedResult);
    }
}
