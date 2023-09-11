package org.chris.week01;

import java.util.ArrayList;
import java.util.List;

public class Divisible_Num_Pairs {

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        
        int k = 3;
        int cont = 0;

        for(int i = 0; i < ar.size(); i++) {

            for(int z = i + 1; z < ar.size(); z++) {
                int temp = ar.get(i) + ar.get(z);
                if(temp == k || temp % k == 0) {
                    cont++;
                }
            }
        }

        System.out.println(cont);
    }
}
