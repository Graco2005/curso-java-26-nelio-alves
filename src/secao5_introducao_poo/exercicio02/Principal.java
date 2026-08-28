package secao5_introducao_poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        f.nome = sc.nextLine();

        System.out.print("Digite o salário bruto do funcionário(R$): ");
        f.salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor do imposto a ser cobrado no salário(R$): ");
        f.imposto = sc.nextDouble();

        System.out.println();
        System.out.println(f);

        double percentual;
        System.out.println();
        System.out.print("Qual o percentual do aumento salarial: ");
        percentual = sc.nextDouble();

        f.aumentoSalarial(percentual);

        System.out.println();
        System.out.println(f);
    }
}
