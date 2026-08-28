package secao5_introducao_poo.exercicio04;

public class Conversor {

    public double precoDolar;
    public double qtdDolaresComprar;

    @Override
    public String toString() {
        return "Conversor{" +
                "precoDolar=" + precoDolar +
                ", qtdDolaresComprar=" + qtdDolaresComprar +
                '}';
    }

    public void converterDolarReal() {
        double qtdReais;
        double resultado = (precoDolar * qtdDolaresComprar) * 1.06;

        System.out.printf("Quantidade para pagar em reais(R$): %.2f%n",resultado);
    }
}
