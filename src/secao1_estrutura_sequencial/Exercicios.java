package secao1_estrutura_sequencial;
// Exercicios propostos

import java.util.Scanner;
import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ex.01:
//       Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//       mensagem explicativa, conforme exemplos.
//        int x, y, soma;
//
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        soma = x + y;
//        System.out.println("SOMA = " + soma);

        // Ex.02:
//       Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com             quatro
//       casas decimais conforme exemplos.
//       Fórmula da área: area = π . raio2
//       Considere o valor de π = 3.14159

//        double raio, area, pi;
//
//        raio = sc.nextDouble();
//        pi = 3.14159;
//        area = pi * Math.pow(raio, 2);
//
//        System.out.printf("A=%.4f", area);

        // Ex.03:
//        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do               produto
//        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

//        int a, b, c, d, a_prod_b, c_prod_d, ab_dif_cd;
//
//        System.out.println("Digite o valor de A: ");
//        a = sc.nextInt();
//
//        System.out.println("Digite o valor de B: ");
//        b = sc.nextInt();
//
//        System.out.println("Digite o valor de C: ");
//        c = sc.nextInt();
//
//        System.out.println("Digite o valor de D: ");
//        d = sc.nextInt();
//
//        a_prod_b = a * b;
//        c_prod_d = c * d;
//
//        ab_dif_cd = a_prod_b - c_prod_d;
//
//        System.out.printf("DIFERENÇA = %d%n", ab_dif_cd);

        // Ex.04:
//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.

//        double num_func, hrs_trab, valor_hr, salario;
//
//        System.out.println("Qual seu número (id): ");
//        num_func = sc.nextDouble();
//
//        System.out.println("Qual a quantidade de horas trabalhadas: ");
//        hrs_trab = sc.nextDouble();
//
//        System.out.println("Qual o valor que recebe por hora: ");
//        valor_hr = sc.nextDouble();
//
//        salario = hrs_trab * valor_hr;
//
//        System.out.printf("NUMBER = %.0f%n", num_func);
//        System.out.printf("SALARY = U$ %.2f%n", salario);

        // Ex.05:
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser             pago.

//        int cod_peca_1, num_peca_1, cod_peca_2, num_peca_2;
//        double val_unit_peca_1, val_unit_peca_2, valor_a_pagar;
//
//        System.out.println("Digite o código da peça 1: ");
//        cod_peca_1 = sc.nextInt();
//
//        System.out.println("Digite a quantidade de peça(s) 1: ");
//        num_peca_1 = sc.nextInt();
//
//        System.out.println("Digite o valor unitário da peça 1: ");
//        val_unit_peca_1 = sc.nextDouble();
//
//        System.out.println("Digite o código da peça 2: ");
//        cod_peca_2 = sc.nextInt();
//
//        System.out.println("Digite a quantidade de peça(s) 2: ");
//        num_peca_2 = sc.nextInt();
//
//        System.out.println("Digite o valor unitário da peça 2: ");
//        val_unit_peca_2 = sc.nextDouble();
//
//        valor_a_pagar = (num_peca_1 * val_unit_peca_1) + (num_peca_2 * val_unit_peca_2);
//
//        System.out.printf("VALOR A PAGAR: R$%.2f%n", valor_a_pagar);

        // Ex.06:
//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//        mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.

        double A, B, C, area_triangulo_retangulo, area_trapezio, area_quadrado, area_retangulo, area_circulo, pi;

        System.out.println("Digite o valor de A: ");
        A = sc.nextFloat();

        System.out.println("Digite o valor de B: ");
        B = sc.nextFloat();

        System.out.println("Digite o valor de C: ");
        C = sc.nextFloat();

        area_triangulo_retangulo = (A * C) / 2;
        pi = 3.14159;
        area_circulo = pi * Math.pow(C, 2);
        area_trapezio = ((A + B) * C) / 2;
        area_quadrado = B * B;
        area_retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", area_triangulo_retangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);
    }
}
