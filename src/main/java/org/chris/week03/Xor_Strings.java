package org.chris.week03;

import java.util.Scanner;

public class Xor_Strings {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data01 = s.next();
        String data02 = s.next();
        String result = "";

        for(int i = 0; i < data01.length(); i++) {
            result += getXOR((data01.charAt(i) + "") , (data02.charAt(i) + ""));
        }


        System.out.println(result);
    }

    public static String getXOR(String data01, String data02) {
        String result = "";

        if(data01.equals("1") && data02.equals("0") || data01.equals("0") && data02.equals("1")) {
            result = "1";
        } else {
            result = "0";
        }

        return result;
    }
}
