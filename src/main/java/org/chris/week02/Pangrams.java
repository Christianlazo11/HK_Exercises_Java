package org.chris.week02;

public class Pangrams {

    public static void main(String[] args) {

        //String inputData = "We promptly judged antique ivory buckles for the next prize    ";
        String inputData = "We promptly judged antique ivory buckles for the prize ";

        String result = getPangram(inputData);

        System.out.println(result);
    }

    public static String getPangram(String data) {
        data = data.trim();
        data = data.replaceAll(" " , "");
        data = data.toLowerCase();

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        boolean isLetter = true;
        for(int i = 0; i < letters.length; i++) {
            if(!isLetter) break;
            for(int j = 0; j < data.length(); j++) {
                if(letters[i].equals(data.charAt(j) + "")) {
                    break;
                }
                if(j == data.length() - 1 ){
                    isLetter = false;
                    break;
                }
            }
        }

        if(!isLetter) {
            return "not pangram";
        }

        return "pangram";
    }
}
