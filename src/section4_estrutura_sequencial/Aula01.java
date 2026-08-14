package section4_estrutura_sequencial;
// Saída de dados em java
import java.util.Locale;

public class Aula01 {
    public static void main(String[] args) {
//        int y = 32;
        double x = 10.35784;
//        System.out.println(y);
//        System.out.println(x);
//        System.out.println("Boa noite!");
//
        System.out.printf("%.4f%n", x); // Valores formatados = (%.Xf), sendo X a quantidade de casas decimais desejadas
        System.out.printf("%.2f%n", x); // Arredonta para cima ou para baixa do que está mais próximo

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x); // '.' no lugar de ','

        // Concatenando strings e variáveis
        System.out.println("RESULTADO = " + x + " METROS"); // usando sout
        System.out.printf("RESULTADO = %.2f METROS%n", x); // usando souf


        // %f = ponto flutuante, %d = inteiro, %s = string, %n = quebra de linha
        String nome = "Luis Graco";
        int idade = 20;
        double renda = 4500.520;

        System.out.printf("%s tem %d anos e ganha R$%.2f reais", nome, idade, renda);
    }
}
