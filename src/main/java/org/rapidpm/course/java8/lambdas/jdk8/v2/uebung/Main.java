package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.legacy.AbstractAction;
import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.legacy.KlasseA;

import java.util.function.Consumer;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public class Main {
    public static void main(String[] args) {
        KlasseA klasseA = new KlasseA();
        klasseA.doMore(new AbstractAction() {
            @Override
            public void stepB(String str) {
                System.out.println("str = " + str);
            }

            @Override
            public void stepC(String str) {
                System.out.println("str = " + str);
            }
        });

        KlasseA_Extended klasseA_ext = new KlasseA_Extended();
        klasseA_ext.doMoreConsumer(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("doMoreConsumer 01= " + s);
            }
        });
        klasseA_ext.doMoreConsumer(s -> System.out.println("doMoreConsumer 02= " + s));

    }
}
