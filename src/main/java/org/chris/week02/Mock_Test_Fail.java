package org.chris.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mock_Test_Fail {

    public static void main(String[] args) {

        List<List<Integer>> inputData = new ArrayList<>(Arrays.asList(
                Arrays.asList(112, 42, 83, 119),
                Arrays.asList(56,125,56,49),
                Arrays.asList(15,78,101,43),
                Arrays.asList(62,98,114,108)
        ));

        int result = getFlipping(inputData);
        System.out.println("Resultado => " + result);
    }

    static int getFlipping(List<List<Integer>> data) {
        int result = 0;
        int colMaxInd = 0;
        int rowMaxInd = 0;
        int[] arrReverseCol;
        int[] arrReverseRow;

        showAllData(data);

        colMaxInd = getMaxSum(data, "col");
        arrReverseCol = getArrValues(data, colMaxInd, "col");

        //Set colReverse in list data
        for(int i = 0; i < data.size(); i++) {
            data.get(i).set(colMaxInd, arrReverseCol[i]);
        }
        System.out.println();

        showAllData(data);

        rowMaxInd = getMaxSum(data, "row");
        arrReverseRow = getArrValues(data, rowMaxInd, "row");

        //Set rowReverse in list data
        for(int i = 0; i < data.size(); i++) {
            data.get(rowMaxInd).set(i, arrReverseRow[i]);
        }
        System.out.println();


        showAllData(data);

        result = getResult(data);
        return result;
    }

    public static int getMaxSum(List<List<Integer>> arr, String type) {
        int[] sumCol = new int[arr.size()];
        int indexA = 0;
        int indexB = 0;
        int maxSum = 0;
        int colMaxInd = 0;



        if(type.equals("col")) {
            //Get sum all colums
            for(int i = 0; i < arr.size(); i++) {

                for(int j = 0; j < arr.get(i).size(); j++) {
                    sumCol[i] += arr.get(indexA).get(indexB);
                    indexA++;
                }
                indexA = 0;
                indexB++;
            }
        } else if(type.equals("row")) {
            //Get sum all rows
            for(int i = 0; i < arr.size(); i++) {

                for(int j = 0; j < arr.get(i).size(); j++) {
                    sumCol[i] += arr.get(indexA).get(indexB);
                    indexB++;
                }
                indexB = 0;
                indexA++;
            }
        }

        //Get max sum value and col of max value
        for(int i = 0; i < sumCol.length; i++) {
            if(sumCol[i] > maxSum) {
                maxSum = sumCol[i];
                colMaxInd = i;
            }
        }

        return colMaxInd;
    }

    public static int[] getArrValues(List<List<Integer>> arr, int MaxInd, String type) {
        int [] getCol = new int[arr.size()];
        int [] getColReverse = new int[arr.size()];
        int index = 0;
        //Get all data column

        if(type.equals("col")) {
            for(int i = 0; i < arr.size(); i++) {
                getCol[i] = arr.get(i).get(MaxInd);
            }
        } else if (type.equals("row")) {
            for (int i = 0; i < arr.size(); i++) {
                getCol[i] = arr.get(MaxInd).get(i);
                System.out.println("Mostando datos => " + getCol[i]);
            }
        }


        for(int i = getCol.length - 1; i >= 0; i--) {
            getColReverse[index] += getCol[i];
            System.out.println("Mostando datos => " + getColReverse[index]);
            index++;

        }

        return getColReverse;
    }

    public static void showAllData(List<List<Integer>> arr) {
        for(int i = 0; i < arr.size(); i++) {

            for(int j = 0; j < arr.get(i).size(); j++) {
                if(j != arr.get(i).size() - 1) {
                    System.out.print(arr.get(i).get(j) + " - ");
                } else {
                    System.out.print(arr.get(i).get(j));
                }

            }
            System.out.println();
        }

        System.out.println("-".repeat(20));
    }

    public static int getResult(List<List<Integer>> arr) {
        int sum = 0;

        for(int i = 0; i < 2; i++) {

            for(int j = 0; j < 2; j++) {
                sum += arr.get(i).get(j);
            }
        }



        return sum;
    }
}
