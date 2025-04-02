package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardValidator {
    public static void main(String[] args) {
        String[] cardNumbers = {"4672375864758374", "5748394839481098", "6374859823759867", "43657346372"};
        for (String cardNumber: cardNumbers){
            System.out.println(cardNumber + ": " + (isValidCard(cardNumber) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidCard(String cardNumber){
        String regex = "^[45][0-9]{15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);
        return matcher.matches();
    }
}
/*
4672375864758374: Valid
5748394839481098: Valid
6374859823759867: Invalid
43657346372: Invalid
 */