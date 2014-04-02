package org.rapidpm.course.java8.lambdas.jdk8.v2.uebung;

import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.legacy.AbstractAction;

import java.util.function.Consumer;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public interface KlasseAMixin {

    public default void doMoreConsumer(Consumer<String> c){
        doMore(new AbstractActionAdapter() {
            @Override
            public void stepB(String str) {
                c.accept(str);
            }
        });
    }
    public default void doOtherConsumer(Consumer<String> c){
        doOther(new AbstractActionAdapter() {
            @Override
            public void stepC(String str) {
                c.accept(str);
            }
        });
    }

    public void doMore(AbstractAction action);
    public void doOther(AbstractAction action);

    public class AbstractActionAdapter extends AbstractAction{
        public void doStepA(String str){
            super.doStepA(str);
        }
        public void stepB(String str){}
        public void stepC(String str){}
    }


}
