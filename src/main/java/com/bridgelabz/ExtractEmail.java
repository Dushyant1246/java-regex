package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    static void printEmailMatches(String input){
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "Contact us at support@example.com and info@company.org";
        printEmailMatches(input);
    }
}
/*
Matched: support@example.com
Matched: info@company.org
 */