package org.chris.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximun_Perimeter_Triangle {

    public static void main(String[] args) {

        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,3,4,5,10));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,3));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,1,1,2,3,5));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,1,1,3,3));
        List<Integer> inputData = new ArrayList<>(Arrays.asList(3,9,2,15,3));

        List<Integer> result = getMaximumPerimeter(inputData);

        System.out.println("Result => " + result);
    }

    public static List<Integer> getMaximumPerimeter(List<Integer> data) {
        Collections.sort(data);
        List<List<Integer>> allData = new ArrayList<>();
        List<Integer> numItems = new ArrayList<>();
        int max = 0;
        int pos = 0;

        for(int i = 0; i < data.size(); i++) {
            if(i == data.size() - 2 ) {
                break;
            }
            int tem01 = data.get(i);
            int tem02 = data.get(i+1);
            int tem03 = data.get(i+2);
            if((tem01 + tem02) > tem03) {
                List<Integer> items = new ArrayList<>();
                items.add(tem01);
                items.add(tem02);
                items.add(tem03);
                allData.add(items);
            };
        }

        System.out.println(allData);

        if(allData.size() > 0) {
            for(int i = 0; i < allData.size(); i++) {
                int sum = 0;
                for(int j = 0; j < allData.get(i).size(); j++) {
                    sum += allData.get(i).get(j);
                }
                numItems.add(sum);
            }

            System.out.println(numItems);

            for(int i = 0; i < numItems.size(); i++) {
                if(numItems.get(i) > max) {
                    max = numItems.get(i);
                    pos = i;
                }
            }

            System.out.println("Pos => " + allData.get(pos));
            return allData.get(pos);
        } else {
            return new ArrayList<>(Arrays.asList(-1));
        }

    }
}
