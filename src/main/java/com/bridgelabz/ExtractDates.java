package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    static void printDateMatches(String input){
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        printDateMatches(input);
    }
}
/*
Matched: 12/05/2023
Matched: 15/08/2024
Matched: 29/02/2020
 */