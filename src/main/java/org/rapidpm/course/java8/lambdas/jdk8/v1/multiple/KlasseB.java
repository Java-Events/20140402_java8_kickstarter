package org.rapidpm.course.java8.lambdas.jdk8.v1.multiple;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public class KlasseB implements InterfaceA, InterfaceC {




    @Override
    public void doSomething() {
        InterfaceA a = new InterfaceA() {};
        a.doSomething();
    }
}
