package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColor {

    public static void main(String[] args) {
        String[] codes = {"#FFA500", "#ff4500", "#gf3456", "#123"};
        for (String code: codes){
            System.out.println(code + ": " + (isValidHexCode(code) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidHexCode(String code){
        String regex = "^#[A-Fa-f0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }
}
/*
#FFA500: Valid
#ff4500: Valid
#gf3456: Invalid
#123: Invalid
 */