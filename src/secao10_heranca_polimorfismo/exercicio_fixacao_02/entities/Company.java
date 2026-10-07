package secao10_heranca_polimorfismo.exercicio_fixacao_02.entities;

public class Company extends TaxPayer {

    private int numberOfEmployes;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmployes) {
        super(name, anualIncome);
        this.numberOfEmployes = numberOfEmployes;
    }

    public int getNumberOfEmployes() {
        return numberOfEmployes;
    }

    public void setNumberOfEmployes(int numberOfEmployes) {
        this.numberOfEmployes = numberOfEmployes;
    }

    @Override
    public double tax() {
        if (numberOfEmployes > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
