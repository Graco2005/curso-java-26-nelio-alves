package secao6_construtores_this_sobrecarga_encapsulamento.exercicio;

public class Banco {

    private final String numeroDaConta;
    private String nomeTitular;
    private double saldo;

    public Banco(String numeroDaConta, String nomeTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldo = depositoInicial;
    }

    public Banco(String numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Conta: " + numeroDaConta + ", Nome do titular: " + nomeTitular + ", Saldo(R$): " + saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {;
        saldo -= valorSaque + 5;
    }
}
