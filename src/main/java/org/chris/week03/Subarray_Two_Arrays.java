package org.chris.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarray_Two_Arrays {

    public static void main(String[] args) {

        /*List<Integer> inputData = new ArrayList<>(Arrays.asList(1,1,1,1,1,1));
        int d = 3;
        int m = 2;*/

        List<Integer> inputData = new ArrayList<>(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1));
        int d = 18;
        int m = 7;

        /*List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,1,3,2));
        int d = 3;
        int m = 2;*/

        /*List<Integer> inputData = new ArrayList<>(Arrays.asList(4));
        int d = 4;
        int m = 1;*/

        /*List<Integer> inputData = new ArrayList<>(Arrays.asList(2,2,1,3,2));
        int d = 4;
        int m = 2;*/

        int result = getCant(inputData, d, m);
        System.out.println(result);
    }

    public static int getCant(List<Integer> data, int d, int m) {

        int result = 0;
        int n = data.size();


        for(int i = 1; i < n; i++) {
            data.set(i, data.get(i) + data.get(i - 1));
        }

        System.out.println(data);

        if(n == m && data.get(0) == d) {
            return 1;
        }
        if(data.get(m - 1) == d && m < data.size()) {
            result++;
        }

        for(int i = m; i < n; i++) {
            if(data.get(i) - data.get(i - m) == d) {
                result++;
                System.out.println("Entra!!!");
            }
        }


        return result;
    }

}
