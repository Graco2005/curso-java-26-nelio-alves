package secao5_introducao_poo.aula01;

public class Triangulo {

    // Atributos
    public double ladoA, ladoB, ladoC;

    public double p = (ladoA + ladoB + ladoC) / 2.0;

    // Métodos
    public double area() {

        double p = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
}
