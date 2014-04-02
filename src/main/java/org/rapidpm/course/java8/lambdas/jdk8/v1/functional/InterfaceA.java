package org.rapidpm.course.java8.lambdas.jdk8.v1.functional;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
@FunctionalInterface
public interface InterfaceA {
    public String doMoreB();

    public default String doMoreA(){
        return "aaeettsch";
    }
}
