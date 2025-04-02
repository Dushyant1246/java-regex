package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtractor {
    static void printProgrammingLanguageMatches(String input){
        String regex = "java|python|javascript|go";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.x";
        printProgrammingLanguageMatches(input);
    }
}
