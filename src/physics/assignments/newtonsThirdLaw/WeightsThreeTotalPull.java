package physics.assignments.newtonsThirdLaw;

public class WeightsThreeTotalPull {

    private double mass1;
    private double mass2;
    private double mass3;
    private double mass4;
    private double acceleration;

    public WeightsThreeTotalPull(double mass1, double mass2, double mass3, double mass4, double acceleration) {
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.mass3 = mass3;
        this.mass4 = mass4;
        this.acceleration = acceleration;
    }

    private double calc() {
        double pull;

        pull = (mass1+mass2+mass3+mass4)*(9.8+acceleration);

        return pull;
    }

    public static void main(String[] args) {
        WeightsThreeTotalPull weightsThreeTotalPull = new WeightsThreeTotalPull(5, 10, 15, 20, 2.33);
        System.out.println(weightsThreeTotalPull.calc());
    }
}
