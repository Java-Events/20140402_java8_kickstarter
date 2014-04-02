package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public abstract class AbstractAction {

    //impl aendern
    public void doStepA(String str){
        System.out.println("doStepA = " + str);
    }
    public abstract void stepB(String str);
    public abstract void stepC(String str);

}
