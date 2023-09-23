package org.chris.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permuting_Two_Arrays {

    public static void main(String[] args) {
        /*List<Integer> dataInput01 = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> dataInput02 = new ArrayList<>(Arrays.asList(7,8,9));
        int k = 10;
        int n = 3;*/

        List<Integer> dataInput01 = new ArrayList<>(Arrays.asList(1,2,2,1));
        List<Integer> dataInput02 = new ArrayList<>(Arrays.asList(3,3,3,4));
        int k = 5;
        int n = 4;

        String result = getPermuting(dataInput01, dataInput02, k, n);

        System.out.println(result);
    }

    public static String getPermuting(List<Integer> data01, List<Integer> data02, int k, int n) {
        String result = "NO";
        int cont = 0;
        int sum = 0;

        for(int i = 0; i < data01.size(); i++) {
            sum += data01.get(i) + data02.get(i);
        }

        if((sum / k) < n ) {
            return "NO";
        }

        Collections.sort(data01);
        Collections.sort(data02, Collections.reverseOrder());

        for(int i = 0; i < data01.size(); i++) {
            if((data01.get(i) + data02.get(i)) >= k ) {
                cont++;
            }
        }

        if(cont == n) {
            result = "YES";
        }
        return result;
    }
}
