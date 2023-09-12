package org.chris.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sparse_Arrays {

    public static void main(String[] args) {

        //List<String> data = new ArrayList<>(Arrays.asList("aba","baba","aba","xzxb"));
        //List<String> queries = new ArrayList<>(Arrays.asList("aba","xzxb","ab"));


        List<String> data = new ArrayList<>(Arrays.asList("def","de","fgh"));
        List<String> queries = new ArrayList<>(Arrays.asList("de","lmn","fgh"));

        List<Integer> result = mathingStrings(data, queries);

        System.out.println(result);

    }

    public static List<Integer> mathingStrings(List<String> data, List<String> queries) {
        Integer[] arr = new Integer[queries.size()];
        Arrays.fill(arr, 0);
        List<Integer> result = new ArrayList<>(Arrays.asList(arr));

        for(int i = 0; i < queries.size(); i++) {

            for(int j = 0; j < data.size(); j++) {
                if(queries.get(i).equals(data.get(j))) {
                    result.set(i, result.get(i) + 1);
                }
            }
        }

        return result;
    }
}
