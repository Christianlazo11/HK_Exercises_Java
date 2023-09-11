package org.chris.week01;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Even_Difference {

    public static void main(String[] args) {
        List<Integer> cont = new ArrayList<>();

        cont.add(2);
        cont.add(4);
        cont.add(1);
        cont.add(7);
        int step = 2;

        List<Integer[]> data = new ArrayList<>();
        int result[] = new int[cont.size()-1];

        for (int i = 0; i < cont.size(); i++) {
            if(step > cont.size()) {
                break;
            }
            Integer [] arr01  = new Integer[step];

            for(int j = 0; j < step; j++) {
                //System.out.println(cont.get(j));
                arr01[j] = cont.get(j);
            }
            step++;
            data.add(arr01);
        }

        for(int i = 0; i < data.size(); i++) {
            Integer arrData[] = data.get(i);
            Arrays.sort(arrData);
            data.set(i, arrData);
            //data.set(i, 5);
            int sum = 0;
            for(int j = 0; j < data.get(i).length; j++) {
                System.out.print(data.get(i)[j] + " | ");
                sum += data.get(i)[j];
                result[i] = sum;
            }
            System.out.println();
        }

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        Collections.sort(cont);

        System.out.println(cont);

        List<Integer[]> datas = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < cont.size(); i++) {
            //System.out.println(cont.get(i));
            List<Integer> d = new ArrayList<>();
            for(int j = i+1; j < cont.size(); j++) {
                d.add(cont.get(j));
                System.out.println("i =" +
                        "> " + i + " j => " + j);
            }

            System.out.println(d);
        }
        //count++;

    }
}
