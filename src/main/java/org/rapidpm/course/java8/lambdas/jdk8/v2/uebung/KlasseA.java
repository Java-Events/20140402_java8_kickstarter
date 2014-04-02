package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public class KlasseA {

    private String txt;

    public void doMore(AbstractAction action){
        action.stepB(txt);

    }
    public void doOther(AbstractAction action){
        action.stepC(txt);
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
