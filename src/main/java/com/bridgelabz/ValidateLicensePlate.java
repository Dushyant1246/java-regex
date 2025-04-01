package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] numbers = {"AB1234", "A12345"};
        for (String number: numbers){
            System.out.println(number + ": " + (isValidLicensePlate(number) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidLicensePlate(String number){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
/*
AB1234: Valid
A12345: Invalid
 */