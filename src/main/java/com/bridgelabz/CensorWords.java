package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CensorWords {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};
        String input = "This is a damn bad example with some stupid words.";
        System.out.println("Without censor: " + input);
        System.out.println("With censor: " + censorBadWords(input, badWords));
    }

    static String censorBadWords(String input, String[] badWords){
        String regex = String.join("|", badWords);

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        StringBuffer censoredString = new StringBuffer();

        while (matcher.find()){
            matcher.appendReplacement(censoredString, "****");
        }
        matcher.appendTail(censoredString);

        return censoredString.toString();
    }
}
/*
Without censor: This is a damn bad example with some stupid words.
With censor: This is a **** bad example with some **** words.
 */