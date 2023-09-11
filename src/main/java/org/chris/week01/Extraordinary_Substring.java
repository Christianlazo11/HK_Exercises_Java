package org.chris.week01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Extraordinary_Substring {

    static HashMap<String, List<Integer>> generalDataString = new HashMap<>();
    static HashMap<String, List<Integer>> totalDataString = new HashMap<>();

    public static void main(String[] args) {

        //String input_str = "bcf"; // ==> 4
        //String input_str = "bef"; // ==> 4
        //String input_str = "abcd"; // ==> 6
        //String input_str = "r"; // ==> ***
        //String input_str = "azjohqvjcwvkzcrblmavjmznisazimipnrsbxoikrkcfjkbahynprxmvdxachfkcglvqkknxapgpqjtniysowy"; // ==> ***
        //String input_str = "vgoqfawmuhoullckdwzgsbzdrwpzbgvdxtywylsatnkdwyrbibcnaytbouaiwmvhfmmpotxfenyvqfmjpceomrd
        // ywbvaobixnysikwdhvwnbfochwtosvtdjxjsmgrtosdwgftmaoibjsfxelpsvbdcxljkpklcujxpsmlxceriopdqsqdxaghdkwusijixxx
        // vcuklukirwcynzqfszzrktmwmmdksiewbinqqxgsjzcwhdxhdfbifimwpdavhbudngyircymalyhusxdhibwxzwcfepplumucgcziirrie
        // scshhysnnwfameogvimcybyipknmzleaeyqpbjxhqlfygfxcfxuejfsjjsksitvpymblizxteqqsqunkizcddxzpuhucvgqbhxexgvfoe
        // lyzixsy"; // ==> ***
        //String input_str = "eegjyleedxgbmlvphhbumenwjqkejnwdeemkrjizijozsslvepecbodhihcbxjnzzweigrshvenwdqbvvtuhtvfsk
        // kierdfocvlzxjuvottsmmzapjrdffoshbvnncwtjdcghkbfotvauoowazeiponeokbiiiddiommfaorcetgzyvxpmyiibyxmmeeszefpzyzb
        // zecvqzdsnevjtmvpxgjhagsynjvcaykmstzjzhrdmpgejhrxophzynwxnaprwrbvyikvoukddoykxezqwafejvlksacqryirwnzbhsaetlmo
        // cytfhjuznoqzrfvwpzolczwgkbviswdmpkgetxcrsvhodbhjxdguxqbnqjkcjgtjzluahbbzldftprtoqioanwnpqhlgxesubgccemxksfqz
        // jczav"; // ==> ***

        String input_str = "nrqqigtqph"; // ==> 22nrqqigtqph
        //String input_str = "bdh"; // ==> 4
        //String input_str = "asdf";
        int cont = 0;

        List<String> allValues = generateAllStrings(input_str);
        System.out.println("Valores => " +allValues);

        for(int i = 0; i < allValues.size(); i++) {
            cont = verifyString((allValues.get(i) + ""), cont);
        }

        System.out.println(cont);

        System.out.println(generalDataString);
        System.out.println(totalDataString);

        //generalDataString.putAll(totalDataString);

        //System.out.println("Que funcione => " + generalDataString);

        int result = compData();

        System.out.println("La cantidad de sub es " + result);

    }

    public static int compData() {
        int cont = 0;
        System.out.println("Resultados-------------------------");
        for(Map.Entry<String, List<Integer>> entry : totalDataString.entrySet()) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            int sum = 0;

            if(value.size() > 1) {
                System.out.println(key);
            }

            for(int i = 0; i < value.size(); i++) {
                if(value.size() > 1) {
                    System.out.print(value.get(i) + " | ");
                }
                sum += value.get(i);
            }
            System.out.println();

            if(sum % value.size() == 0) {
                cont++;
            }
        }

        return cont;

    }

    public static int verifyString(String data, int cont) {

        int result = verifyDataString(data);

        return cont;
    }

    public static int verifyDataString(String value) {

        HashMap<String, Integer> vowels = new HashMap<>();
        settingData(vowels);
        //System.out.println(vowels);
        int result = 0;

        for(Map.Entry<String, Integer> entry: vowels.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            if(value.length() == 1) {
                for(int i = 0; i < clave.length(); i++) {
                    if(clave.charAt(i) == value.charAt(0)) {
                        result = valor;
                        List<Integer> valuesResult = new ArrayList<>();
                        valuesResult.add(valor);
                        generalDataString.put(clave.charAt(i) + "", valuesResult);
                        break;
                    }
                }
            }

        }
        /*if(value.length() > 1) {

        }*/

        List<Integer> valuesResult02 = new ArrayList<>();
        for(int i = 0; i < value.length(); i++) {

            for(Map.Entry<String, List<Integer>> entry: generalDataString.entrySet()) {
                String clave = entry.getKey();
                List<Integer> valor = entry.getValue();

                if(clave.equals(value.charAt(i)+"")) {
                    valuesResult02.add(valor.get(0));
                }
            }

        }

        totalDataString.put(value , valuesResult02);

        return result;
    }


    public static List<String> generateAllStrings(String values) {
        List<String> allStrings = new ArrayList<>();
        int steps = 1;
        int index = 0;
        int fin = 2;
        int div = values.length() / steps;
        int cont = 0;
        int legthData = 1;

        for(int i = 0; i > -1; i++) {
            if(steps == 1) {
                allStrings.add(values.charAt(i) +"");
                cont++;
                if(cont == div) {
                    steps = 2;
                    cont = 0;
                }
            } else  {
                if(legthData == values.length()) {
                    break;
                }
                div = values.length() - legthData;
                String result = values.substring(index, fin);

                allStrings.add(result);
                index +=1;
                fin += 1;
                System.out.println("Index => " + index + " Fin => " + fin + "Result => " + result);
                cont++;
                if(cont == div) {
                    steps += 1;
                    cont = 0;
                    index = 0;
                    fin = steps;
                    legthData++;
                }
            }
        }

        return allStrings;
    }

    public static HashMap<String, Integer> settingData(HashMap<String, Integer> x) {

        x.put("ab", 1);
        x.put("cde", 2);
        x.put("fgh", 3);
        x.put("ijk", 4);
        x.put("lmn",5);
        x.put("opq", 6);
        x.put("rst", 7);
        x.put("uvw", 8);
        x.put("xyz", 9);
        return x;
    }
}
