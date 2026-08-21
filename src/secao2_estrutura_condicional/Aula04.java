package secao2_estrutura_condicional;
//Expressão condicional ternária

public class Aula04 {
    public static void main(String[] args) {

        // Exemplo usando a condicional padrão:
//        double preco, desconto;
//        preco = 34.5;
//        if (preco < 20.0) {
//            desconto = preco * 0.1;
//        } else {
//            desconto = preco * 0.05;
//        }

        // Exemplo usando a condicional ternária
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto: " + desconto);
    }
}
