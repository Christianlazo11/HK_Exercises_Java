package org.chris.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mock_Test_Ok {

    public static void main(String[] args) {

        /*List<List<Integer>> inputData = new ArrayList<>(Arrays.asList(
                Arrays.asList(112, 42, 83, 119),
                Arrays.asList(56,125,56,49),
                Arrays.asList(15,78,101,43),
                Arrays.asList(62,98,114,108)
        ));*/

        List<List<Integer>> inputData = new ArrayList<>(Arrays.asList(
                Arrays.asList(107, 54, 128, 15),
                Arrays.asList(12,75,110,138),
                Arrays.asList(100,96,34,85),
                Arrays.asList(75,15,28,112)
        ));

        int result = getFlipping(inputData);
        System.out.println("Resultado => " + result);
    }

    public static int getFlipping(List<List<Integer>> arr) {
        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n / 2; i++) {
            List<Integer> sumData = new ArrayList<>();
            for(int j = 0; j < n / 2; j++) {
                sumData.add(arr.get(i).get(j));
                sumData.add(arr.get(i).get(n-j-1));
                sumData.add(arr.get(n-i-1).get(j));
                sumData.add(arr.get(n-i-1).get(n-j-1));
                int result = getMax(sumData);
                sum += result;

                sumData.clear();
            }
        }

        return sum;
    }

    public static int getMax(List<Integer> data) {
        int max = 0;

        for(Integer n : data) {
            if (n > max ) {
                max = n;
            }
        }

        return max;
    }
}
