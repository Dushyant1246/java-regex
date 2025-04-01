package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us"};
        for (String username: usernames){
            System.out.println(username + ": " + (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidUsername(String username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
/*
user_123: Valid
123user: Invalid
us: Invalid
 */