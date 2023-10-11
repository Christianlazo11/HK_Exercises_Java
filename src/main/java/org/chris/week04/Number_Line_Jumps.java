package org.chris.week04;

public class Number_Line_Jumps {

    public static void main(String[] args) {

        //int[] dataInput = {2,1,2,1};
        //int[] dataInput = {0,2,5,3};
        //int[] dataInput = {0,3,4,2};
        //int[] dataInput = {20,8,96,2};
        int[] dataInput = {45,7,56,2};

        String result = getKangaro(dataInput[0],dataInput[1],dataInput[2],dataInput[3]);

        System.out.println(result);

    }

    private static String getKangaro(int x1, int v1, int x2, int v2) {
        int result01 = x1 + v1;
        int result02 = x2 + v2;

        if(result01 == result02) {
            return "YES";
        }

        while(result01 <= result02 && v1 > v2) {
            result01 += v1;
            result02 += v2;
            if(result01 == result02) {
                return "YES";
            }
        }

        return "NO";
    }
}
