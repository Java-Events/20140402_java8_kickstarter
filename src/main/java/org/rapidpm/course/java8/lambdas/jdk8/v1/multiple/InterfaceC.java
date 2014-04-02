package org.rapidpm.course.java8.lambdas.jdk8.v1.multiple;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public interface InterfaceC {
    public  default void doSomething(){
        System.out.println(" InterfaceC -> doSomething");
    }
}
