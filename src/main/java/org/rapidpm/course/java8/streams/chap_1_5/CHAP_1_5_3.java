package org.rapidpm.course.java8.streams.chap_1_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Sven Ruppert
 * Date: 03.12.13
 * Time: 13:23
 */
public class CHAP_1_5_3 {
    public static void main(String[] args) {
        final List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matrix.add(Arrays.asList(1,2,3,4,5,66,7,8,9)); //hier eine 66
        matrix.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        matrix.forEach(System.out::println);

    }
}
