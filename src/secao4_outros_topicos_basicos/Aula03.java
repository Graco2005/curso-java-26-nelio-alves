package secao4_outros_topicos_basicos;
// Funções

import java.util.Scanner;

public class Aula03 {

    // Função que calcula o maior valor dentre três números
    public static float calcMaiorNum(float x, float y, float z) {
        if (x > y && x > z) return x;
        else return Math.max(y, z);
    }

    // Função que exibe na tela um valor qualquer
    public static void imprimir(float valor) {
        System.out.println("Maior valor = " + valor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3;

        System.out.println("Digite três números: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        imprimir(calcMaiorNum(n1, n2, n3));

        sc.close();
    }
}
