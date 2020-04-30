package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class IdealGasCoolingMoles {

    private double initTemp;
    private double finalTemp;
    private double energy;

    public IdealGasCoolingMoles(double initTemp, double finalTemp, double energy) {
        this.initTemp = initTemp;
        this.finalTemp = finalTemp;
        this.energy = energy;
    }

    private double calc() {
        double moles;

        moles = energy / (718*(finalTemp-initTemp));

        return moles;
    }

    public static void main(String[] args) {
        IdealGasCoolingMoles idealGasCoolingMoles = new IdealGasCoolingMoles(513.77, 384.58, 797.21);
        System.out.println(idealGasCoolingMoles.calc());
    }
}
