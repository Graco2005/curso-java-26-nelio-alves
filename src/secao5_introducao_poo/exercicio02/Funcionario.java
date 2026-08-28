package secao5_introducao_poo.exercicio02;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    @Override
    public String toString() {
        return "Funcionario: " + nome +
                ", $ " + salarioLiquido();
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalarial(double porcentagem) {
        salarioBruto = salarioBruto + (salarioBruto * (porcentagem / 100));
    }
}
