package org.chris.week01;

public class Max_Index {
    public static void main(String[] args) {

        int steps = 2;
        int batIndex = 1;

        int i = 0;
        int j = 1;
        int cont = 0;

        for(int k = 0; k  > -1; k++) {

            if(cont == 0 && i == 0 && j == 2) {
                cont++;
                continue;
            }

            if(cont >= steps) {
                break;
            }

            i += j;
            j ++;
            cont++;
            System.out.println("i => " + i + " j => " + j + " Cont => " + cont);

            if(i == batIndex) {
                //i -= (j - 1);
                i = 0;
                j = 2;
                cont = 0;
            }



        }

        System.out.println(i);

    }
}
