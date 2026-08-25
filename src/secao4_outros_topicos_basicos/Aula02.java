package secao4_outros_topicos_basicos;
// Funções interessantes para String

import java.util.Arrays;

public class Aula02 {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";
        System.out.println("Original: -" + original + "-");

        String s01 = original.toLowerCase(); // Colocando o texto para letras minúsculas
        System.out.println("toLowerCase: -" + s01 + "-");

        String s02 = original.toUpperCase(); // Colocando o texto para letras maiúsculas
        System.out.println("toUpperCase: -" + s02 + "-");

        String s03 = original.trim(); // Removendo os espaços em branco nas extremidades do texto
        System.out.println("trim: -" + s03 + "-");

        String s04 = original.substring(4); // Pegando o texto do ponto inicial 4
        System.out.println("substring(4): -" + s04 + "-");

        String s05 = original.substring(6, 9); // Pegando o texto do ponto inicial 5 até o ponto final 9
        System.out.println("substring(6, 9): -" + s05 + "-");

        String s06 = original.replace("a", "x"); // Trocando todos os 'a's do texto por 'x's
        System.out.println("replace(a, x): -" + s06 + "-");

        String s07 = original.replace("abc", "xyz"); // replace funciona tambémpara substrings
        System.out.println("replace(abc, xyz): -" + s07 + "-");

        int i = original.indexOf("bc"); // Pega a primeira ocorrência(index) da substring 'bc'
        System.out.println("indexOf(bc): " + i );

        int j = original.lastIndexOf("bc"); // Pega a última ocorrência(index) da substring 'bc'
        System.out.println("lastIndexOf(bc): " + j);


        // Operação Split

        String s = "potato lemon apple";
        System.out.println();

        String[] vector = s.split(" "); // Separando a string a cada espaço vazio encontrado
        String vector_pos_0 = vector[0];
        String vector_pos_1 = vector[1];
        String vector_pos_2 = vector[2];

        System.out.println("Vetor criado: " + Arrays.toString(vector));
        System.out.println("Vetor posição 0: " + vector_pos_0);
        System.out.println("Vetor posição 1: " + vector_pos_1);
        System.out.println("Vetor posição 2: " + vector_pos_2);

    }
}
