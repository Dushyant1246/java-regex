package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValuesExtractor {
    static void printCurrencyValueMatches(String input){
        String regex = "[$€£¥₹]?[0-9]+\\.[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "The price is $45.99, and the discount is 10.50.";
        printCurrencyValueMatches(input);
    }
}
/*
Matched: $45.99
Matched: 10.50
 */