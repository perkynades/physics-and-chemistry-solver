package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class AdiabaticProcessThermalEnergy {

    private double work;

    public AdiabaticProcessThermalEnergy(double work) {
        this.work = work;
    }

    private double calc() {
        return -work;
    }

    public static void main(String[] args) {
        AdiabaticProcessThermalEnergy adiabaticProcessThermalEnergy = new AdiabaticProcessThermalEnergy(16);
        System.out.println(adiabaticProcessThermalEnergy.calc());
    }
}
