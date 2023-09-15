package org.chris.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flipping_bits {

    public static void main(String[] args) {

        List<Long> dataInput = new ArrayList<>(Arrays.asList(2147483647L,1L,0L));

        dataInput.forEach(e -> System.out.println(getFlip(e)));
    }

    public static Long getFlip(Long data) {
        Long bits = 4294967295L;
        Long result = bits - data;
        return result;
    }
}
