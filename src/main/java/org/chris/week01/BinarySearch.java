package org.chris.week01;

import java.lang.reflect.Array;

public class BinarySearch {

    public static void main(String[] args) {

        //Pruebas
        //String binaryStr = "1111"; // debe dar 2
        //String binaryStr = "101"; // debe dar 4
        //String binaryStr = "0000"; // debe dar 0
        //String binaryStr = "00110"; // debe dar 1
        String binaryStr = "010011"; // debe dar 3
        //String binaryStr = "000010"; // debe dar 1


        int cont = 0;
        int ind = 0;
        int fin = 1;
        boolean isBinary = false;

        for(int i = 0; i < binaryStr.length(); i++) {
            if(binaryStr.charAt(i) != '0') {
                isBinary = true;
                break;
            }
        }

        if(!isBinary) {
            System.out.println("Se termino ;)" + " cont => " + cont);
            // Aqui hay que hacer un return de cont que seria 0, pero al ser esta la
            // clase principal no me deja en haker rank seguro si deja
            //return cont
        }




        char []binaryData = binaryStr.toCharArray();

        System.out.println(binaryData[ind] + " =>>>>>>>>> " + binaryData[fin]);
        while(binaryData[ind] == '0' && binaryData[fin] == '0' && fin < (binaryData.length - 1)) {
            ind += 2;
            fin += 2;
        }

        if(binaryData[ind] == '0' && binaryData[fin+1] == '1') {
            System.out.println("Entra en lo que quiero probar");
            int contFin = fin + 1;
            if(contFin < binaryData.length) {
                if(binaryData[contFin] == '1') {
                    ind += 1;
                    fin += 1;
                }
            }
        }

        for(int i = 0; i > -1; i++) {
            System.out.println("contador => " + cont);
            cont++;

            while(binaryData[ind] == '0' && binaryData[fin] == '0' && fin < (binaryData.length - 1)) {
                ind += 2;
                fin += 2;
                System.out.println("Aqui toy");
                System.out.println(ind);
                System.out.println(fin);
            }
            if((fin+1) < binaryData.length) {
                if(binaryData[ind] == '0' && binaryData[fin] == '1' && binaryData[fin+1] == '1') {
                    System.out.println("Entra en lo que quiero probarxxxxxxxx");
                    ind += 1;
                    fin += 1;
                }
            }

            System.out.println("----- " + binaryData[ind] + " *******" + binaryData[fin]);
            System.out.println("*******" + ind + "******" + fin);
            String data = ConverBinary(binaryData[ind], binaryData[fin]);
            System.out.println("Original => " + binaryData[ind] +""+ binaryData[fin]);
            System.out.println("Retorno => " +data);


            binaryData[ind] = data.charAt(0);
            binaryData[fin] = data.charAt(1);



            if(data.equals("00")) {
                int com01 = fin +1;
                int com02 = fin +2;
                if(com01 < binaryData.length && com02 < binaryData.length) {
                    if(binaryData[fin+1] == '1' && binaryData[fin+2] == '1' ){
                        ind += 2;
                        fin += 2;
                        System.out.println("Entro");
                    } else{
                        ind += 1;
                        fin += 1;
                    }
                } else if(com01 == binaryData.length) {
                    System.out.println("Puedo hacer algo");
                    break;
                }else if (binaryData[com01] == '0') {
                    break;
                }else {
                    ind += 1;
                    fin += 1;
                }

                if(fin > binaryData.length - 1 ) {
                    System.out.println("Termino");
                    break;
                }


            }

            System.out.println("--------------------------------");
        }

        System.out.println(cont);
    }

    public static String ConverBinary(char x, char y) {

        int val01 = Integer.parseInt(String.valueOf(x));
        int val02 = Integer.parseInt(String.valueOf(y));

        System.out.println("datos resibidos => "+ val01 + "|" + val02);
        String result = "";

        if(val01 == 1 && val02 == 1) {
            result += "00";
        } else {
            result += "11";
        }
        /*else if (val01 == 0 && val02 == 1 || val01 == 1 && val02 == 0) {
            result += "11";
        } else {
            result += "00";
        }*/

        return result;

    }
}
