package secao5_introducao_poo.exercicio01;

public class Retangulo {

    public double altura;
    public double largura;

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }

    public double areaRetangulo() {
        return altura * largura;
    }

    public double perimetroRetangulo() {
        return 2 * (altura + largura);
    }

    public double diagonalRetangulo() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}
