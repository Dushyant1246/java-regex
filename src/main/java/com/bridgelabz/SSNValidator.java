package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidator {
    public static void main(String[] args) {
        String[] ssnList = {"123-45-6789", "123456789"};
        for (String ssn: ssnList){
            System.out.println(ssn + ": " + (isValidCard(ssn) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidCard(String ssn){
        String regex = "^(?!000)[0-9]{3}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }
}
/*
123-45-6789: Valid
123456789: Invalid
 */