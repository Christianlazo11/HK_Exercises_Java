package org.chris.week02;

public class Mars_Exploration {

    public static void main(String[] args) {

        //String inputData = "SOSSPSSQSSOR";
        String inputData = "SOSOSOSOSDSDSKWOSDOSDOAS" +
                "DOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS";

        int result = getExploration(inputData);

        System.out.println(result);
    }

    public static int getExploration(String data) {
        int result = 0;
        int index = 0;
        for(int i = 0; i < data.length() / 3; i++) {

            if(data.charAt(index) != 'S') {
                result++;
            }
            if(data.charAt(index + 1) != 'O') {
                result++;
            }
            if(data.charAt(index + 2) != 'S') {
                result++;
            }

            index += 3;

        }
        return result;
    }
}
