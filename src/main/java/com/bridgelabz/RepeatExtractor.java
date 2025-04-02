package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatExtractor {

    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        printRepeatedWordsMatches(input);
    }

    static void printRepeatedWordsMatches(String input){
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String result = matcher.group();
            result = result.substring(result.length()/2).trim();
            System.out.println("Matched: " + result);
        }
    }
}
/*
Matched: is
Matched: repeated
 */