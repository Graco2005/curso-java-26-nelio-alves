package secao7_comportamento_memoria_array_listas.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa serão digitadas: ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa ->");
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura(m): ");
            float altura = sc.nextFloat();

            vect[i]= new Pessoa(nome, idade, altura);

        }

        double somaAlturas = 0.0;
        int menores16 = 0;

        for (int i = 0; i < vect.length; i++) {
            somaAlturas += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                menores16++;
            }
        }

        double alturaMedia = somaAlturas / n;
        double porcentagemMenores = ((double) menores16 / n) * 100.00;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenores + "%");

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}
