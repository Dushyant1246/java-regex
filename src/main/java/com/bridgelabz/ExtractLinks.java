package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    static void printLinkMatches(String input){
        String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "Visit https://www.google.com and http://example.org for more info.";
        printLinkMatches(input);
    }
}
/*
Matched: https://www.google.com
Matched: http://example.org
 */