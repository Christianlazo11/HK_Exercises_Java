package org.chris.week01;

import java.util.Arrays;

public class Mock_Test {

    public static void main(String[] args) {

        int[] arr = {1,2,3,6,5,4,7,9};
        Arrays.sort(arr);
        for(int a : arr) {
            System.out.print(a + " -- ");
        }
        System.out.println();
        int result = calMed(arr);

        System.out.println(result);
    }

    public static int calMed(int[] data) {
        int result = 0;

        if(data.length % 2 == 0) {
            int mid = data.length / 2;
            result = data[mid] + data[mid - 1];
            result = ((int) (result / 2)) + 1 ;
        } else {
            result = data[(int) Math.floor(data.length / 2)];
        }
        return result;
    }
}
