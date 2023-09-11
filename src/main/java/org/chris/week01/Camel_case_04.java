package org.chris.week01;

public class Camel_case_04 {

    public static void main(String[] args) {


        //String input = "S;M;plasticCup()";
        //String input = "S;C;LargeSoftwareBook";
        //String input = "S;V;pictureFrame";
        //String input = "C;C;coffee machine";
        //String input = "C;M;white sheet of paper";
        // input = "C;V;mobile phone";
        /*        Scanner s = new Scanner(System.in);

        List<String> input = new ArrayList<>();

        while(s.hasNextLine()) {
            input.add(s.nextLine());
        }

        for(int i = 0; i < input.size(); i++) {
            String result = transformData(input.get(i));
            System.out.println(result);
        }
        * */
        String input = "C;M;mouse pad";

        char op1 = input.substring(0,1).charAt(0);
        char op2 = input.substring(2,3).charAt(0);
        String cad = input.substring(4);
        String result = "";

        System.out.println(op1 + " " + op2);
        System.out.println(cad);



        if(op1 == 'S') {
         if(op2 == 'M') {
              cad = cad.substring(0, cad.length() - 2);
         }
         if(op2 == 'M' || op2 == 'V') {
             for(int i = 0; i < cad.length(); i++) {
                 if(Character.isUpperCase(cad.charAt(i))) {
                     result += " " + (cad.charAt(i) + "").toLowerCase();
                 } else {
                     result += cad.charAt(i);
                 }
             }
         }

         if(op2 == 'C') {
             for(int i = 0; i < cad.length(); i++) {
                 if(Character.isUpperCase(cad.charAt(i))) {
                     if(i > 0) {
                         result += " " + (cad.charAt(i) + "").toLowerCase();
                     } else {
                         result += (cad.charAt(i) + "").toLowerCase();
                     }
                 } else {
                     result += cad.charAt(i);
                 }
             }
         }

        } else if (op1 == 'C') {
            boolean isSpace = false;

            if(op2 == 'C' || op2 == 'M' || op2 == 'V') {
                for(int i = 0; i < cad.length(); i++) {
                    if(i == 0 || isSpace) {
                        result += (cad.charAt(i) + "").toUpperCase();
                        isSpace = false;
                    } else if( cad.charAt(i) == ' ') {
                        isSpace = true;
                    }else {
                        result += cad.charAt(i);
                    }
                }
            }
            if(op2 == 'M') {
                result += "()";
            }
            if(op2 == 'V' || op2 == 'M') {
                char d = result.charAt(0);
                result = (d+"").toLowerCase() +  result.substring(1);
            }
        }

        System.out.println(result);

    }


}
