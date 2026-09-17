package secao8_topicos_especiais_java_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula03 {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-09-17");
        LocalDateTime d02 = LocalDateTime.parse("2026-09-17T12:26:37");
        Instant d03 = Instant.parse("2026-09-17T01:26:37Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println();
        System.out.println("D01 dia: " + d01.getDayOfMonth());
        System.out.println("D01 mês: " + d01.getMonthValue());
        System.out.println("D01 ano: " + d01.getYear());

        System.out.println();
        System.out.println("D02 hora: " + d02.getHour());
        System.out.println("D02 minutos: " + d02.getMinute());
    }
}
