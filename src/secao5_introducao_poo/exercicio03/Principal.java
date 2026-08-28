package secao5_introducao_poo.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite seu nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a primeira nota(0-30): ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota(0-35): ");
        aluno.nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota(0-35): ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        aluno.aprovadoReprovado();
    }
}
