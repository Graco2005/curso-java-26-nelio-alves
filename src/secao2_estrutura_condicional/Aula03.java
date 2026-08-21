package secao2_estrutura_condicional;
// Estrutura switch-case

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x;
        String dia;

        dia = "";

        System.out.print("Digite um número inteiro de 1 a 7: ");
        x = sc.nextInt();

        // Solução utilizando if-else
//        if (x == 1) dia = "Domingo";
//        else if (x == 2) dia = "Segunda";
//        else if (x == 3) dia = "Terça";
//        else if (x == 4) dia = "Quarta";
//        else if (x == 5) dia = "Quinta";
//        else if (x == 6) dia = "Sexta";
//        else if (x == 7) dia = "Sábado";
//        else System.out.println("Valor inválido");
//
//        System.out.println("Dia da semana: " + dia);

        dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
