package secao10_heranca_polimorfismo.exercicio_fixacao_02.application;

import secao10_heranca_polimorfismo.exercicio_fixacao_02.entities.Company;
import secao10_heranca_polimorfismo.exercicio_fixacao_02.entities.Individual;
import secao10_heranca_polimorfismo.exercicio_fixacao_02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de contribuintes: ");
        int taxPayers = sc.nextInt();
        sc.nextLine();

        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i = 0; i < taxPayers; i++) {
            System.out.print("Pessoa física(cpf) ou pessoa jurídica(pj)? ");
            String resp = sc.nextLine();

            if (resp.equalsIgnoreCase("cpf") || resp.equalsIgnoreCase("pessoa física")) {
                System.out.println("PESSOA FÍSICA(CPF):");
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.print("Renda anual: ");
                double rendaAnual = sc.nextDouble();
                sc.nextLine();

                System.out.print("Gastos com saúde: ");
                double gastoSaude = sc.nextDouble();
                sc.nextLine();

                taxPayerList.add(new Individual(nome, rendaAnual, gastoSaude));
                System.out.println();
            } else if (resp.equalsIgnoreCase("pj") || resp.equalsIgnoreCase("pessoa jurídica")) {
                System.out.println("PESSOA JURÍDICA(PJ):");
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.print("Renda anual: ");
                double rendaAnual = sc.nextDouble();
                sc.nextLine();

                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                sc.nextLine();

                taxPayerList.add(new Company(nome, rendaAnual, numeroFuncionarios));
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("TAXAS PAGAS:");

        double sum = 0;
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(taxPayer.getName() + ": " + String.format("%.2f", taxPayer.tax()));
            sum += taxPayer.tax();
        }

        System.out.println("TAXAS TOTAIS: $ " + sum);

        sc.close();
    }
}
