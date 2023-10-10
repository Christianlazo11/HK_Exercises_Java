package org.chris.week04;

import java.util.*;

public class Picking_Numbers {

    public static void main(String[] args) {

        //List<Integer> inputData = new ArrayList<>(Arrays.asList(4,6,5,3,3,1));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,1,2,2,4,4,5,5,5));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,2,3,1,2));
        List<Integer> inputData = new ArrayList<>(Arrays.asList(84, 43, 11, 41, 2,
                99, 31, 32, 56, 53, 42, 14, 98, 27, 64, 57, 16, 33, 48, 21, 46, 61,
                87, 90, 28, 12, 62, 49, 29, 77, 82, 70, 80, 89, 95, 52, 13, 19, 9, 79,
                35, 67, 51, 39, 7, 1, 66, 8, 17, 85, 71, 97, 34, 73, 75, 6, 91, 40, 96,
                65, 37, 74, 20, 68, 23, 47, 76, 55, 24, 3, 30, 22, 55, 5, 69, 86, 54, 50,
                10, 59, 15, 4, 36, 38, 83, 60, 72, 63, 78, 58, 88, 93, 45, 18, 94, 44, 92,
                81, 25, 26));

        int result = getPicking(inputData);

        System.out.println(result);
    }

    public static int getPicking(List<Integer> data) {
        List<List<Integer>> totalData = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < 100; i++) {
            totalData.add(new ArrayList<>());
        }

        Collections.sort(data);
        System.out.println(data);
        int index = 0;
        int step = 0;
        int contStep = 0;
        int cant = 1;

        for(int i = 1; i < data.size(); i++) {
            index = data.get(i) - data.get(i - 1);
            System.out.println("Index => " + index);
            if(index <= cant) {

                if(contStep == 0) {
                    totalData.get(step).add(data.get(i - 1));
                }
                totalData.get(step).add(data.get(i));
                if (index > 0) {
                    cant--;
                }
                contStep++;

            } else {
                cant = 1;
                step++;
                contStep = 0;
            }
        }


        System.out.println(totalData);

        for (List<Integer> totalDatum : totalData) {
            if (totalDatum.size() > max) {
                max = totalDatum.size();
            }
        }
        return max;
    }
}
