package org.chris.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Left_Rotation {

    public static void main(String[] args) {

        /*List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int d = 4;*/

        List<Integer> inputData = new ArrayList<>(Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58,
                84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51));
        int d = 10;

        List<Integer> result = getRotate(inputData, d);
        System.out.println(result);

    }

    public static List<Integer> getRotate(List<Integer> data, int d) {
        List<Integer> result = new ArrayList<>(data);

        System.out.println(result);

        for(int i = 0; i < d; i++) {
            int temp = result.get(0);
            result.remove(0);
            result.add(temp);
        }

        return result;
    }
}
