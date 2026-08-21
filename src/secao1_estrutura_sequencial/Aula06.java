package secao1_estrutura_sequencial;
// Funções matemáticas em Java

public class Aula06 {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        double delta, x1, x2;

        delta = Math.pow(y, 2.0) - 4 * x * z;

        x1 = (-y + Math.sqrt(delta)) / (2.0 * x);
        x2 = (-y - Math.sqrt(delta)) / (2.0 * x);

        System.out.println();
        System.out.printf("Valor do Delta: %.2f%n", delta);
        System.out.printf("Valor de x1: %.2f%n", x1);
        System.out.printf("Valor de x2: %.2f%n", x2);
    }
}
