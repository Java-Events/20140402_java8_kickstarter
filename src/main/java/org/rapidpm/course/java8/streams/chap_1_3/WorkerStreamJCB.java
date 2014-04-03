package org.rapidpm.course.java8.streams.chap_1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.rapidpm.course.java8.lambdas.jdk8.v2.uebung.Main;
import org.rapidpm.course.java8.streams.DemoValueGenerator;
import org.rapidpm.course.java8.streams.Pair;
import org.rapidpm.course.java8.streams.WorkLoadGenerator;
import static org.rapidpm.course.java8.streams.chap_1_3.Worker.ANZAHL_KURVEN;

/**
 *
 * @author jcb
 */
public class WorkerStreamJCB implements Worker {

    private static final DemoValueGenerator valueGenerator = new DemoValueGenerator() {
    };
    private static final WorkLoadGenerator generator = new WorkLoadGenerator();

    @Override
    public List<List<Double>> generateInterpolatedValues(List<List<Integer>> baseValues) {
        return baseValues.parallelStream().map(valueList -> {
            return generator.generate(valueList);
        }).collect(Collectors.toList());
    }

    @Override
    public List<List<Integer>> generateDemoValueMatrix() {
        final Stream.Builder<List<Integer>> builder = Stream.<List<Integer>>builder();
        for (int i = 0; i < ANZAHL_KURVEN; i++) {
            builder.add(valueGenerator.generateDemoValuesForY());
        }
        return builder.build().collect(Collectors.toList());
    }

}
