package com.parisesoftware.mapper;

import java.util.ArrayList;

public interface IStringToArrayMapper {

    ArrayList<String> convertToArray(String inputString, String splitPattern);
}
