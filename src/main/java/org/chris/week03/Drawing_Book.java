package org.chris.week03;

public class Drawing_Book {

    public static void main(String[] args) {

        //int[] inputData = {5,3};
        int[] inputData = {6,2};
        //int[] inputData = {5,4};

        int result = getCount(inputData[0], inputData[1]);

        System.out.println(result);
    }

    public static int getCount(int n, int p) {

        if(p == 1 || p == n) {
            return 0;
        }

        if(n%2 == 0) {
            if(n - p == 1 || n - p == 2) {
                return 1;
            }
        }

        System.out.println("Devuelve!" + Math.ceil((double)(p-1) / 2));
         return Math.min((int)Math.ceil((double)(p-1) / 2),((n - p) / 2));
    }
}
