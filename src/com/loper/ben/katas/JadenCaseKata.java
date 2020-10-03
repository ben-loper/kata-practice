package com.loper.ben.katas;

import java.util.ArrayList;
import java.util.List;

public class JadenCaseKata {

    public String toJadenCase(String phrase) {
        String result = "";

        if(phrase != null && !phrase.equals("")) {

            String[] strings = phrase.split(" ");
            List<String> jadenCaseStrings = new ArrayList<String>();

            for (String string : strings) {
                string = string.toLowerCase();
                jadenCaseStrings.add(capitalizeFirstLetter(string));
            }
            result = convertArrayListToString(jadenCaseStrings);
        } else {
            result = null;
        }

        return result;
    }

    private String capitalizeFirstLetter(String input){
        String firstLetter = Character.toString(input.charAt(0));
        String remainingLetters = input.substring(1);

        return firstLetter.toUpperCase() + remainingLetters;
    }

    private String convertArrayListToString(List<String> words){
        String result = "";

        for (int i = 0; i < words.size(); i++) {
            if (i + 1 == words.size()) {
                result += words.get(i);
            } else {
                result += words.get(i) + " ";
            }
        }

        return result;
    }

}
