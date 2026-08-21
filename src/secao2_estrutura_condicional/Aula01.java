package secao2_estrutura_condicional;
// Estrutura condicional (if-else)

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas;
        System.out.println("Que horas são: ");
        horas = sc.nextInt();

//        if (horas < 12) {
//            System.out.println("Bom dia!");
//        }
//        else {
//            System.out.println("Boa tarde!");
//        }

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
    }
}
