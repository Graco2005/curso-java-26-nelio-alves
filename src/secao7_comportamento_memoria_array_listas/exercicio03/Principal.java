package secao7_comportamento_memoria_array_listas.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static Integer posicaoId(List<Funcionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos funcionários vão ser registrados: ");
        int qtdFuncionarios = sc.nextInt();

        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.println("Funcionário #" + (i + 1));

            System.out.print("Qual o id: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.print("Qual o nome: ");
            String nome = sc.nextLine();

            System.out.print("Qual o salário: ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);

            lista.add(funcionario);
        }

        System.out.println();

        System.out.print("Coloque o id do funcionário que vai ter seu salário aumentado: ");
        int buscarId = sc.nextInt();
        Integer posicao = posicaoId(lista, buscarId);
        if (posicao == null) {
            System.out.println("Essa posição não existe!");
        } else {
            System.out.print("Coloque a porcentagem: ");
            double percentual = sc.nextDouble();
            lista.get(posicao).aumentarSalario((int) percentual);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario func : lista) {
            System.out.println(func);
        }
    }
}
