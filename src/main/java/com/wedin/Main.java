package com.wedin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7));
        integers1.add(2, 3);
        integers1.add(7, 8);
        integers1.forEach(System.out::println);
    }
}
