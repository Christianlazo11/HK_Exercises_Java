package org.chris.week03;

import java.util.*;
import java.util.HashMap;

public class Migratory_Birds {

    public static void main(String[] args) {

        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,1,2,2,3));
        //List<Integer> inputData = new ArrayList<>(Arrays.asList(1,4,4,4,5,3));
        List<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4));

        int result = getBirds(inputData);
        System.out.println("Result => " + result);
    }

    public static int getBirds(List<Integer> data) {
        int result = 6;
        int max = 0;
        List<Integer> finalKeys = new ArrayList<>();

        System.out.println(data);

        HashSet<Integer> unitData = new HashSet<>(data);

        System.out.println(unitData);

        HashMap<Integer, Integer> totalData = new HashMap<>();

        for(Integer x: unitData) {
            totalData.put(x, 0);
        }

        for(int i = 0; i < data.size(); i++) {
            if(unitData.contains(data.get(i))) {
                totalData.put(data.get(i), totalData.get(data.get(i)) + 1);
            }
        }

        System.out.println(totalData);

        for(Integer n: totalData.values()) {
            if(n > max) {
                max = n;
            }
        }

        for(Map.Entry<Integer, Integer> entry : totalData.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == max) {
                finalKeys.add(key);
            }
        }

        for(Integer x: finalKeys) {
            if(x < result) {
                result = x;
            }
        }

        return result;
    }
}
