package secao5_introducao_poo.exercicio03;

public class Aluno {

    public String nome;
    public double nota1, nota2, nota3;

    public void aprovadoReprovado() {
        if (nota1 + nota2 + nota3 >= 60) {
            System.out.println("Nota final: " + (nota1 + nota2 + nota3));
            System.out.println("Aprovado.");
        } else {
            System.out.println("Nota final: " + (nota1 + nota2 + nota3));
            System.out.println("Reprovado faltando " + (60 - (nota1 + nota2 + nota3)) + " pontos");
        }
    }
}
