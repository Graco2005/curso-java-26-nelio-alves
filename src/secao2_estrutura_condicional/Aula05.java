package secao2_estrutura_condicional;
// Escopo e Inicialização

public class Aula05 {
    public static void main(String[] args) {

        int num;

        // Para evitar que o compilador coloque um erro e impeça a execução do código, é necessário inicializar as variáveis no escopo principal do código, mesmo que seja iniciada com valor 0 ou um que ainda vai ser digitado pelo usuário (Scanner)

        num = 0;

        if (num % 2 == 0) System.out.println("Este número é par.");
        else System.out.println("Este número é ímpar.");
    }
}
