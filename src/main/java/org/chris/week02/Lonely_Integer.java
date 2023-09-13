package org.chris.week02;

import java.util.*;

public class Lonely_Integer {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));

        int result = lonelyInt(arr);

        System.out.println(result);
    }

    public static int lonelyInt(List<Integer> data) {
        int result = 0;
        HashSet<Integer> items = new HashSet<>(data);
        HashMap<String, Integer> totalItems= new HashMap<String, Integer>();

        for(Integer n : items) {
            totalItems.put(n.toString(), 0);
        }

        for(Map.Entry entry: totalItems.entrySet()) {

            for(int i = 0; i < data.size(); i++) {
                if(entry.getKey().equals(data.get(i).toString())) {
                    Integer res = (int)entry.getValue() + 1;
                    entry.setValue(res);
                }
            }
        }

        for(Map.Entry entry: totalItems.entrySet()) {
            Integer value = (int)entry.getValue();
            String key = entry.getKey().toString();

            System.out.println("key => " + key + " value => " + value);

            if(value == 1) {
                result = Integer.parseInt(key);
                break;
            }

        }


        return result;
    }
}
