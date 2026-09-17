package secao8_topicos_especiais_java_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula02 {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-09-17");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-17T00:45:00");
        Instant d03 = Instant.parse("2022-07-17T00:45:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        // Primeira opção para formatação (var d01 --format--> var fmt1)
        System.out.println("D01: " + d01.format(fmt1));
        // Segunda opção para formatar (var fmt1 --format--> var d01)
        System.out.println("D01: " + fmt1.format(d01));
        // Terceira opção de formatação (var d01 --format--> (DateTimeFormatter.ofPattern("dd/MM/yyyy")))
        System.out.println("D01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();
        System.out.println("D02: " + d02.format(fmt2));
        System.out.println("D02: " + d02.format(fmt4));

        System.out.println();
        System.out.println("D03: " + fmt3.format(d03));
        System.out.println("D03: " + d03);
    }
}
