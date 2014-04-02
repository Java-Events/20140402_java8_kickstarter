package org.rapidpm.course.java8.jsr310;

import java.time.LocalTime;

/**
 * Created by ts40 on 31.03.2014.
 */
public class F_LocalTime {
    public static void main(String[] args) {
        LocalTime thisSec = LocalTime.now();
        System.out.println("thisSec.getHour() = " + thisSec.getHour());
        System.out.println("thisSec.getMinute() = " + thisSec.getMinute());
    }
}
