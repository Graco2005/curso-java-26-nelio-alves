package secao7_comportamento_memoria_array_listas.aula06;
// Listas

import java.util.ArrayList;
import java.util.List;

public class Aula06 {
    static void main() {

        List<String> lista = new ArrayList<>();

        lista.add("Luis");
        lista.add("Ana");
        lista.add("Marina");
        lista.add("Vinícius");
        lista.add(2, "Guilherme"); // Adcionando diretamente na posição 2

        lista.remove("Vinícius");


        System.out.println("Tamanho da lista: " + lista.size());

        for (String pessoa : lista) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------");

        lista.remove(1);
        lista.removeIf(x -> x.charAt(0) == 'G');

        System.out.println("Tamanho da lista: " + lista.size());

        for (String pessoa : lista) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------");
        System.out.println("Index de Marina: " + lista.indexOf("Marina"));
        System.out.println("Index de Guilherme: " + lista.indexOf("Guilherme"));

        System.out.println("-------------------");
        lista.add("Mônica");

        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').toList();

        for (int i = 0; i < result.toArray().length; i++) {
            System.out.println(result.get(i));
        }

        System.out.println("-------------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);

        System.out.println(nome);
    }
}
