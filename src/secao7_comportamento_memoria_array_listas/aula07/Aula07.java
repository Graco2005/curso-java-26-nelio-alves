package secao7_comportamento_memoria_array_listas.aula07;
// Matrizes (Exercício resolvido)

import java.util.Scanner;

public class Aula07 {
    static void main() {

        // Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ser a quantidade de linhas e colunas da matriz: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Digite um número para a " + (i + 1) + "a linha e " + (j + 1) + "a coluna: ");
                int num = sc.nextInt();
                matrix[i][j] = num;
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int numerosNegativos = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) numerosNegativos++;
            }
        }

        System.out.println("Quantidade de números negativos na matriz: " + numerosNegativos);

        sc.close();
    }
}
