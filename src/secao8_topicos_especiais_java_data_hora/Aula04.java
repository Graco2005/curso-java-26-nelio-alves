package secao8_topicos_especiais_java_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula04 {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-09-17");
        LocalDateTime d02 = LocalDateTime.parse("2026-09-17T12:26:37");
        Instant d03 = Instant.parse("2026-09-17T01:26:37Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("D01 default: " + d01);
        System.out.println("D01 past week: " + pastWeekLocalDate);
        System.out.println("D01 next week: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println();
        System.out.println("D02 default: " + d02);
        System.out.println("D02 past week: " + pastWeekLocalDateTime);
        System.out.println("D02 next week: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("D03 default: " + d03);
        System.out.println("D03 past week: " + pastWeekInstant);
        System.out.println("D03 next week: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        System.out.println();
        System.out.println("T1 dias: " + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d02); // Diferença entre d02 e pastWeekLocalDateTime
        System.out.println();
        System.out.println("T2 dias: " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d03);
        System.out.println();
        System.out.println("T3 dias: " + t3.toDays());
    }
}
