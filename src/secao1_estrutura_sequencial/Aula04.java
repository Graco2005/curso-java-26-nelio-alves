package secao1_estrutura_sequencial;
// Entrada de dados em java - Parte 01

import java.util.Locale;
import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        String x = sc.next();
//        System.out.println("Você digitou: " + x);
//
//        double x;
//        x = sc.nextDouble();
//
//        System.out.printf("Você digitou: %.2f%n", x);

//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("Você digitou: " + x);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
