package org.chris.week01;

import java.util.ArrayList;
import java.util.List;

public class Mini_Max_Sum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(769082435);
        arr.add(210437958);
        arr.add(673982045);
        arr.add(375809214);
        arr.add(380564127);

        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;
        List<Long> data = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            Long result = 0L;
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    result += arr.get(j);
                }
            }
            data.add(result);
        }

        for(int i = 0; i < data.size(); i++) {
            if(data.get(i) > max) {
                max = data.get(i);
            }
            if (data.get(i) < min) {
                min = data.get(i);
            }
            System.out.println(data.get(i));
        }

        System.out.println(min + "  " + max );
    }
}
