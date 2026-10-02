package secao10_heranca_polimorfismo.exercicio_resolvido_01.entities;

public class OutsorcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsorcedEmployee() {
    }

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + 1.1 * additionalCharge;
    }
}
