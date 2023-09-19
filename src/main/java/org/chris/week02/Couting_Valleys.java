package org.chris.week02;

public class Couting_Valleys {

    public static void main(String[] args) {
        //String inputData = "UDDDUDUU";
        String inputData = "DDUUDDUDUUUD";

        int result = getValleys(inputData);
        System.out.println(result);
    }

    public static int getValleys(String data) {

        int result = 0;
        int cont = 0;
        boolean isInit = false;

        for(int i = 0; i < data.length(); i++) {

            if(data.charAt(i) == 'U') {
                cont++;
            } else if (data.charAt(i) == 'D') {
                cont--;
            }

            if(cont == 0 && isInit) {
                result++;
                isInit = false;
            }

            if(cont < 0) {
                isInit = true;
            }

        }
        return result;
    }
}


