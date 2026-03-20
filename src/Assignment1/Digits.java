package Assignment1;

import java.util.Scanner;

public class Digits {
    public static void main(String[]args) {
       System.out.println(isAllDigits("123456"));
       System.out.println(isAllDigits("123a12"));
    }

    public static String isAllDigits(String s) {
        if(s.isEmpty()){
            return "Yes";
        }

        char first=s.charAt(0);
        if (!Character.isDigit(first)){
            return "No";
        }
        return isAllDigits(s.substring(1));
    }

}
