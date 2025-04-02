package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
    public static void main(String[] args) {
        String[] IPs = {"0.0.0.0", "0.0.0.255", "1.1.1", "192.168.1.4.6", "256.255.255.255"};
        for (String IP: IPs){
            System.out.println(IP + ": " + (isValidIPv4(IP) ? "Valid" : "Invalid"));
        }
    }

    static boolean isValidIPv4(String IP){
        String regex = "^(([0-9]|[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(IP);
        return matcher.matches();
    }
}
/*
0.0.0.0: Valid
0.0.0.255: Valid
1.1.1: Invalid
192.168.1.4.6: Invalid
256.255.255.255: Invalid
 */