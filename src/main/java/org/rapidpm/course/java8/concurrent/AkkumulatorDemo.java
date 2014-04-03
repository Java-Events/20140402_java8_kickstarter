package org.rapidpm.course.java8.concurrent;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;

/**
 * Created by ts40 on 05.03.14.
 */
public class AkkumulatorDemo {

    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();

        longAdder.increment();
        longAdder.increment();
        longAdder.increment();

        System.out.println("longAdder.sum() = " + longAdder.sum());

        LongAccumulator longAccumulator = new LongAccumulator((left, right) -> {
            System.out.println("left = " + left);
            System.out.println("right = " + right);

            return left + right;
        },0L);

        longAccumulator.accumulate(3);
        System.out.println("longAccumulator = " + longAccumulator.longValue());


    }
}
