package secao2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Exercício 01
//        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

//        int num;
//
//        System.out.print("Digite um número inteiro: ");
//        num = sc.nextInt();
//
//        if (num > 0) System.out.println(num + " é um número positivo.");
//        else System.out.println(num + " é um número negativo.");

        // Exercício 02
//        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

//        int num;
//
//        System.out.print("Digite um número inteiro: ");
//        num = sc.nextInt();
//
//        if (num % 2 == 0) System.out.println(num + " é par.");
//        else System.out.println(num + " é ímpar");

        // Exercício 03
//        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados         em
//        ordem crescente ou decrescente.

//        int A, B;
//
//        System.out.print("Digite um número inteiro: ");
//        A = sc.nextInt();
//
//        System.out.print("Digite outro número inteiro: ");
//        B = sc.nextInt();

//        if (A > B) {
//            if (A % B == 0) System.out.println("São múltiplos.");
//            else System.out.println("Não são múltiplos.");
//        }
//        else {
//            if (B % A == 0) System.out.println("São múltiplos");
//            else System.out.println("Não são múltiplos.");
//        }

        // Outra forma de resolver seria trocando os valores das variáveis A e B (preferível devido ao menor nível de complexidade comparada a outra forma)
        // A variável 'aux' deve somente ser definida dentro do escopo do if e não fora da condicional. Pois para casos em que a condição não seja satisfeita, a variável se torna obsoleta.

//        if (A < B) {
//            int aux = A;
//            A = B;
//            B = aux;
//        }
//
//        if (A % B == 0) System.out.println("São múltiplos.");
//        else System.out.println("Não são múltiplos");

        // Exercício 04
//        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

//        int hora_inicial, hora_final, resultado;
//
//        resultado = 0;
//
//        System.out.print("Que horas começou o jogo: ");
//        hora_inicial = sc.nextInt();
//
//        System.out.print("Que horas terminou o jogo: ");
//        hora_final = sc.nextInt();
//
//        if (hora_inicial < hora_final) {
//            resultado = hora_final - hora_inicial;
//        }
//        else {
//            resultado = (24 - hora_inicial) + hora_final;
//        }
//
//        System.out.println("O jogo durou " + resultado + " hora(s)");

        // Exercício 05
//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

//        int codigo, qtd;
//        double valor_conta;
//        String alimento;
//
//        System.out.println("""
//        CODIGO\tESPECIFICAÇÃO\t\tPREÇO
//        ----------------------------------------
//        1\tCachorro Quente\t\tR$ 4.00
//        2\tX-Salada\t\t    R$ 4.50
//        3\tX-Bacon\t\t\t    R$ 5.00
//        4\tTorrada simples\t\tR$ 2.00
//        5\tRefrigerante\t\tR$ 1.50
//        """);
//
//        valor_conta = 0;
//        alimento = "";
//
//        System.out.println("Qual alimento (informe o código) você deseja: ");
//        codigo = sc.nextInt();
//
//        System.out.println("Qual a quantidade: ");
//        qtd = sc.nextInt();
//
//        if (codigo == 1) {
//            valor_conta = 4.00 * qtd;
//            alimento = "Cachorro quente";
//        } else if (codigo == 2) {
//            valor_conta = 4.50 * qtd;
//            alimento = "X-Salada";
//        } else if (codigo == 3) {
//            valor_conta = 5.00 * qtd;
//            alimento = "X-Bacon";
//        } else if (codigo == 4) {
//            valor_conta = 2 * qtd;
//            alimento = "Torrada simples";
//        } else if (codigo == 5) {
//            valor_conta = 1.50 * qtd;
//            alimento = "Refrigerante";
//        }
//
//        System.out.printf("ALIMENTO: %s\nVALOR A PAGAR(R$): %.2f", alimento, valor_conta);

        // Exercício 06
//
//        double intervalo;
//
//        System.out.print("Informe um valor qualquer: ");
//        intervalo = sc.nextDouble();
//
//        if (intervalo < 0) {
//            System.out.println("Fora do intervalo.");
//        }
//        if (intervalo > 100) {
//            System.out.println("Fora do intervalo.");
//        }
//
//        if (intervalo >= 0 && intervalo <= 25) {
//            System.out.println("Intervalo [0,25]");
//        } else if (intervalo > 25 && intervalo <= 50) {
//            System.out.println("Intervalo (25,50]");
//        } else if (intervalo > 50 && intervalo <= 75) {
//            System.out.println("Intervalo  (50,75]");
//        } else if (intervalo > 75 && intervalo <= 100) {
//            System.out.println("Intervalo  (75,100]");
//        }

        // Exercício 07
//        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//        Se o ponto estiver na origem, escreva a mensagem “Origem”.
//        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//        situação.

//        double x, y;
//
//        System.out.print("Digite o valor de x: ");
//        x = sc.nextDouble();
//
//        System.out.print("Digite o valor de y: ");
//        y = sc.nextDouble();
//
//        if (x == 0 && y == 0) System.out.println("Você está na origem.");
//
//        if ((x > 0 || x < 0)&& y == 0) System.out.println("Você está sobre o eixo x.");
//        if (x == 0 && (y > 0 || y < 0)) System.out.println("Você está sobre o eixo y.");
//
//        if (x > 0 && y > 0) System.out.println("Você está no quadrante Q1.");
//        else if (x < 0 && y > 0) System.out.println("Você está no quadrante Q2.");
//        else if (x < 0 && y < 0) System.out.println("Você está no quadrante Q3.");
//        else if (x > 0 && y < 0) System.out.println("Você está no quadrante Q4.");

        // Exercício 08
//        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,            sem
//        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//                Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a             faixa de
//        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa         é
//        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com          duas casas decimais.

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
