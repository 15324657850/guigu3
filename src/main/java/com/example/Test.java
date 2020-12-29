package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add(i);
            }
        }

        System.out.println(list.size());

        for (Integer i : list) {
            System.out.print(i + ",");
        }
    }
}
