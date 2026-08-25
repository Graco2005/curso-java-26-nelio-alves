package secao4_outros_topicos_basicos;
// Operadores bitwise

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n1 = 89;
//        int n2 = 60;
//
//        System.out.println(n1 & n2); // operador 'e' bit a bit
//        System.out.println(n1 | n2); // operador 'ou' bit a bit
//        System.out.println(n1 ^ n2); // operador 'não exclusivo' bit a bit

        // Testando se o sexto bit é verdadeiro ou falso
        int n = sc.nextInt();
        int mask = 0b00100000;

        if ((n & mask) != 0) System.out.println("6th bit is true (1)!");
        else System.out.println("6th bit is false (0)!");

        sc.close();
    }
}
