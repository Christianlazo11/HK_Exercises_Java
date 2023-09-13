package org.chris.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading_Students {

    public static void main(String[] args) {

        List<Integer> dataStudents = new ArrayList<>(Arrays.asList(73,67,38,33));

        List<Integer> result = gradingStudents(dataStudents);

        result.forEach(e -> System.out.println(e));

    }

    public static List<Integer> gradingStudents (List<Integer> data) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < data.size(); i++) {

            if(data.get(i) <= 37) {
                result.add(data.get(i));
            } else {

                int temp = data.get(i);
                int cont = 0;
                boolean isChange = false;

                while(cont < 2) {
                    System.out.println("Contando");
                    cont++;
                    temp++;
                    if(temp % 5 == 0) {
                        isChange = true;
                        break;
                    }
                }

                if(isChange) {
                    result.add(temp);
                } else {
                    result.add(data.get(i));
                }

            }
        }
        return result;
    }
}
