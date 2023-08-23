package org.chris.week01;

public class Time_Conversion {

    public static void main(String[] args) {

        String s = "01:05:08PM";

        String hh = "";
        String mm = "";
        String ss = "";
        String tymeAmPm = "";
        String result = "";

        tymeAmPm = s.substring((s.length() - 2), s.length());
        hh = s.substring(0,2);
        mm = s.substring(3,5);
        ss = s.substring(6,8);

        int hhNum = Integer.parseInt(hh);
        int mmNum = Integer.parseInt(mm);
        int ssNum = Integer.parseInt(ss);


        //System.out.println(hhNum + " " + mmNum + " " + ssNum);

        if (tymeAmPm.equalsIgnoreCase("AM")) {
            if(hhNum == 12) {
                result += "00:";
                result += addDigit(mmNum) + ":";
                result += addDigit(ssNum);
            } else {
                result += addDigit(hhNum) +":";
                result += addDigit(mmNum) + ":";
                result += addDigit(ssNum);
            }
        } else if (tymeAmPm.equalsIgnoreCase("PM")) {
            if(hhNum == 12) {
                result += String.valueOf(hhNum) + ":";
                result += addDigit(mmNum) + ":";
                result += addDigit(ssNum);
            } else {
                result += String.valueOf(hhNum + 12) + ":";
                result += addDigit(mmNum) +":";
                result += addDigit(ssNum);
            }
        }

        System.out.println(result);
    }

    public static String addDigit(int value) {
        if(value < 10) {
            return "0" + String.valueOf(value);
        }

        return String.valueOf(value);
    }
}
