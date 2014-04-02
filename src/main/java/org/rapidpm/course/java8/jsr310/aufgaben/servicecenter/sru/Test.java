package org.rapidpm.course.java8.jsr310.aufgaben.servicecenter.sru;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public class Test {


    public static void main(String[] args) {
        final LocalTime localTime = LocalTime.of(18, 0, 0);
        final LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), localTime);




    }
}
