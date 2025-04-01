package com.bridgelabz;

public class ReplaceWhiteSpaces {
    public static void main(String[] args) {
        String input = "This    is  an example  with  multiple  spaces.";
        System.out.println("Original: " + input);
        System.out.println("Replaced: " + replaceDoubleWhiteSpaces(input));
    }

    static String replaceDoubleWhiteSpaces(String input){
        String regex = "\\s{2,}";
        return input.replaceAll(regex, " ");
    }
}
/*
Original: This    is  an example  with  multiple  spaces.
Replaced: This is an example with multiple spaces.
 */