package org.chris.week01;

import java.util.ArrayList;
import java.util.List;

public class Plus_Minus {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        int pos = 0;
        int neg = 0;
        int zero = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) < 0) {
                neg++;
            } else if(arr.get(i) == 0){
                zero++;
            }
        }

        float posD = ((float)pos / (float)arr.size());
        float negD = (float)neg / (float)arr.size();
        float zeroD = (float)zero/ (float)arr.size();

        System.out.printf("%.6f%n%.6f%n%.6f%n", posD,negD,zeroD);
    }
}
