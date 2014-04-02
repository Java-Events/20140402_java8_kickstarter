package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.legacy.AbstractAction;
import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.legacy.KlasseA;

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


    }
}
