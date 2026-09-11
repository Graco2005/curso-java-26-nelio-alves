package secao8_topicos_especiais_java_data_hora;
// Instanciando data-hora em Java

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    static void main() {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-03-14");
        LocalDateTime d05 = LocalDateTime.parse("2026-03-14T18:30:00");
        Instant d06 = Instant.parse("2026-03-14T18:33:25Z");
        Instant d07 = Instant.parse("2026-03-14T18:33:25-03:00");

        LocalDate d08 = LocalDate.parse("14/03/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("14/03/2026 18:12", fmt2);

        LocalDate d10 = LocalDate.of(2026, 3, 14);
        LocalDateTime d11 = LocalDateTime.of(2026, 3, 14, 18, 12);

        System.out.println("Data atual: " + d01.toString());
        System.out.println("Data atual com horas: " + d02.toString());
        System.out.println("Data atual com horas e fuso: " + d03.toString());
        System.out.println();
        System.out.println("Tranformando um padrão ISO 8601 em objeto: " + d04.toString());
        System.out.println("Tranformando um padrão ISO 8601 em objeto: " + d05.toString());

        System.out.println("D06: " + d06.toString());
        System.out.println("D07: " + d07.toString());
        System.out.println("D08 formatado: " + d08.toString());
        System.out.println("D09: " + d09.toString());
        System.out.println("D10: " + d10.toString());
        System.out.println("D11: " + d11.toString());
    }
}
