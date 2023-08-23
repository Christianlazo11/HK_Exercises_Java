package org.chris.week01;

import java.util.ArrayList;
import java.util.List;

public class Breakng_The_Records {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        data.add(3);
        data.add(4);
        data.add(21);
        data.add(36);
        data.add(10);
        data.add(28);
        data.add(35);
        data.add(5);
        data.add(24);
        data.add(42);

        int min = data.get(0);
        int max = data.get(0);
        int contMin = 0;
        int contMax = 0;

        for(int i = 1; i < data.size(); i++) {
            if(data.get(i) > max) {
                max = data.get(i);
                contMax++;
            }
            if(data.get(i) < min) {
                min = data.get(i);
                contMin++;
            }
        }

        System.out.println(contMax + " " + contMin);
    }
}
