package org.chris.week03;

import java.util.*;

public class Sales_By_Match {

    public static void main(String[] args) {

        //List<Integer> dataInput = new ArrayList<>(Arrays.asList(1,2,1,2,1,3,2));
        List<Integer> dataInput = new ArrayList<>(Arrays.asList(1,1,3,1,2,1,3,3,3,3));
        //List<Integer> dataInput = new ArrayList<>(Arrays.asList(10,20,20,10,10,30,50,10,20));


        int result = getSales(dataInput);
        System.out.println(result);
    }

    public static int getSales(List<Integer> data) {
        int result = 0;

        Set<Integer> dataUnit = new HashSet<>(data);
        HashMap<Integer, Integer> dataTotal = new HashMap<>();

        for(Integer n : dataUnit) {
            dataTotal.put(n, 0);
        }

        System.out.println(dataTotal);

        for(int i = 0; i < data.size(); i++) {
            if(dataUnit.contains(data.get(i))) {
                System.out.println("Entra!!!" + data.get(i));
                dataTotal.put(data.get(i), dataTotal.get(data.get(i)) + 1);
            }
        }

        System.out.println(dataTotal);

        for(Integer n : dataTotal.values()) {
            result += n/2;
        }


        return result;
    }
}
