package secao6_construtores_this_sobrecarga_encapsulamento.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String numeroConta, nomeTitular;
        char opcao;
        double deposito, saque;

        System.out.print("Digite o numero da conta: ");
        numeroConta = sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        nomeTitular = sc.nextLine();

        System.out.println("Deseja realizar algum depósito inicial? (s=sim) (outro=não)");
        opcao = sc.next().toLowerCase().charAt(0);

        if (opcao == 's') {
            System.out.print("Digite o valor do depósito: ");
            deposito = sc.nextDouble();
            Banco b = new Banco(numeroConta, nomeTitular, deposito);
            System.out.println();
            System.out.println("Dados da conta:");
            System.out.println(b);

            System.out.print("Insira um valor de depósito(R$): ");
            deposito = sc.nextDouble();
            b.depositar(deposito);

            System.out.println("Dados da conta:");
            System.out.println(b);

            System.out.print("Insira um valor de saque(R$): ");
            saque = sc.nextDouble();

            b.sacar(saque);

            System.out.println("Dados da conta:");
            System.out.println(b);

        } else {
            Banco b = new Banco(numeroConta, nomeTitular);
            System.out.println();
            System.out.println("Dados da conta:");
            System.out.println(b);

            System.out.print("Insira um valor de depósito(R$): ");
            deposito = sc.nextDouble();
            b.depositar(deposito);

            System.out.println("Dados da conta:");
            System.out.println(b);

            System.out.print("Insira um valor de saque(R$): ");
            saque = sc.nextDouble();

            b.sacar(saque);

            System.out.println("Dados da conta:");
            System.out.println(b);
        }

        sc.close();
    }
}
