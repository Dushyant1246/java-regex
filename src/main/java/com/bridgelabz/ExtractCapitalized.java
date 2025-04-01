package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalized {
    static void printCapitalizedMatches(String input){
        String regex = "[A-Z][A-Za-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "The Eiffel Tower is in Paris123 and the Statue of Liberty is in New York.  ";
        printCapitalizedMatches(input);
    }
}
/*
Matched: The
Matched: Eiffel
Matched: Tower
Matched: Paris
Matched: Statue
Matched: Liberty
Matched: New
Matched: York
 */