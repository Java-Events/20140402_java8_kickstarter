package org.rapidpm.course.java8.jsr310.aufgaben.servicecenter.sru;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by Sven Ruppert on 02.04.2014.
 */
public class Main {
    final static ZoneId zoneIdBerlin = ZoneId.of("Europe/Berlin");
    final static ZoneId zoneIdAU = ZoneId.of("Australia/Darwin");
    public static void main(String[] args) {
        ZonedDateTime zdtSupport = ZonedDateTime.of(LocalDateTime.now(), zoneIdBerlin);
        System.out.println("zdtSupport = " + zdtSupport);

        final OffsetDateTime offsetDateTimeBerlin = zdtSupport.toOffsetDateTime();
        System.out.println("offsetDateTimeBerlin = " + offsetDateTimeBerlin);
        final int totalSecondsOffsetBerlin = offsetDateTimeBerlin.getOffset().getTotalSeconds();
        System.out.println("totalSecondsOffsetBerlin = " + totalSecondsOffsetBerlin);
        final int hoursBerlin = totalSecondsOffsetBerlin / 60 / 60;
        System.out.println("hoursBerlin = " + hoursBerlin);


        ZonedDateTime zdtServiceCenterAU = zdtSupport
                .toLocalDateTime().atZone(zoneIdAU);
        System.out.println("zdtServiceCenterAU = " + zdtServiceCenterAU);
        final int totalSecondsSupport = zdtServiceCenterAU
                .toOffsetDateTime().getOffset().getTotalSeconds();
        System.out.println("totalSecondsSupport = " + totalSecondsSupport);
        final int hoursSupport = totalSecondsSupport / 60 / 60;
        System.out.println("hoursSupport = " + hoursSupport);

        final int delta = hoursBerlin - hoursSupport;
        System.out.println("delta = " + delta);

        final ZonedDateTime zonedDateTime = zdtServiceCenterAU.plusHours(delta);
        System.out.println("zonedDateTime = " + zonedDateTime);


    }
}
