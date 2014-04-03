/*
 * Copyright 2014 RapidPM.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.course.java8.streams.chap_1_3.uebung;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.rapidpm.course.java8.streams.DemoValueGenerator;
import org.rapidpm.course.java8.streams.WorkLoadGenerator;
import org.rapidpm.course.java8.streams.chap_1_3.Worker;

/**
 *
 * @author TSantanius
 */
public class Uebung_ts1_parallel implements Worker {

  @Override
  public List<List<Integer>> generateDemoValueMatrix() {
    DemoValueGenerator valueGenerator = new DemoValueGenerator() {};
    return Stream
            .generate(() -> valueGenerator.generateDemoValuesForY())
            .limit(Worker.ANZAHL_KURVEN)
            .collect(Collectors.toList());
  }

  @Override
  public List<List<Double>> generateInterpolatedValues(List<List<Integer>> baseValues) {
    final WorkLoadGenerator generator = new WorkLoadGenerator();
    return baseValues.parallelStream()
           .map((List<Integer> t) -> generator.generate(t))
           .collect(Collectors.toList());
  }

  
    public static void main(String[] args) {

    final WorkLoadGenerator generator = new WorkLoadGenerator();
    DemoValueGenerator valueGenerator = new DemoValueGenerator() {
    };

    List<List<Integer>> demoValueMatrix = Stream
            .generate(() -> valueGenerator.generateDemoValuesForY())
            .limit(Worker.ANZAHL_KURVEN)
            .collect(Collectors.toList());

    List<List<Double>> result = demoValueMatrix.parallelStream()
            .map((List<Integer> t) -> generator.generate(t))
            .collect(Collectors.toList());

  }
}
