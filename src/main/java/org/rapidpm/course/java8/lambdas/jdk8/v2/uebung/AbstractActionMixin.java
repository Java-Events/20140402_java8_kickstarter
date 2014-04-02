package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

import java.util.function.Consumer;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public interface AbstractActionMixin {

    public default void doStepAConsumer(Consumer<String> c){

    }
    public default void stepBConsumer(Consumer<String> c){
        //stepB();
    }
    public default void stepCConsumer(Consumer<String> c){

    }


    public void doStepA(String str);
    public void stepB(String str);
    public void stepC(String str);


}
