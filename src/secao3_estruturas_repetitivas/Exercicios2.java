package secao3_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ex.01
//        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//        X, se for o caso.


//        int x; x = sc.nextInt();
//
//        for (int i = 1; i <= x; i++) {
//            if (i % 2 == 1) System.out.println(i);
//        }

        // Ex.02
//        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

//        int n, num_rep, in, out; n = sc.nextInt(); in = 0; out = 0;
//
//        for (int i = 0; i < n; i++) {
//            num_rep = sc.nextInt();
//
//            if (num_rep >= 10 && num_rep <= 20) in++;
//            else out++;
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

        // Ex.03
//        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//        peso 5.

//        int n; n = sc.nextInt();
//        double x, y, z, media_pond;
//
//        for (int i = 0; i < n; i++) {
//            x = sc.nextDouble();
//            y = sc.nextDouble();
//            z = sc.nextDouble();
//
//            media_pond = ((x * 2.0) + (y * 3.0) + (z * 5.0)) / 10;
//            System.out.printf("%.1f", media_pond);
//        }

        // Ex.04
//        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

//        int n, x, y; n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            x = sc.nextInt(); y = sc.nextInt();
//
//            if (y != 0) {
//                double div = (double) x / y;
//                System.out.println(div);
//            } else {
//                System.out.println("Divisão impossivel");
//            }
//        }

        // Ex.05
//        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//        Lembrando que, por definição, fatorial de 0 é 1.

//        int n = sc.nextInt();
//
//        int fat = 1;
//
//        for (int i = 1; i <= n; i++) {
//            fat = fat * i;
//        }
//
//        System.out.println(fat);

        // Ex.06
//        Ler um número inteiro N e calcular todos os seus divisores.

//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) System.out.println(i);
//        }

        // Ex.07
//        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
//        conforme exemplo.

//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
//            System.out.println();
//        }
        sc.close();
    }
}
