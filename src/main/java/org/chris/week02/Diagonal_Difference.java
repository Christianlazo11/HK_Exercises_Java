package org.chris.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagonal_Difference {
    public static void main(String[] args) {
        List<List<Integer>> inputData = new ArrayList<>(Arrays.asList(
                Arrays.asList(11,2,4),
                Arrays.asList(4,5,6),
                Arrays.asList(10,8,-12)
        ));

        int result = calDif(inputData);
        System.out.println(result);
    }

    public static int calDif(List<List<Integer>> data) {
        int diag01 = 0;
        int diag02 = 0;

        int indexA = 0;
        int indexB = 0;

        int indexC = 0;
        int indexD = data.size() - 1;

        for (int i = 0; i < data.size(); i++) {

            diag01 += data.get(indexA).get(indexB);
            indexA++;
            indexB++;

            diag02 += data.get(indexC).get(indexD);
            indexC++;
            indexD--;

        }

        return Math.abs(diag01 - diag02);
    }
}




