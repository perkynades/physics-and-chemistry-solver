package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class CylinderCompressedInternalEnergy {

    private double moles;
    private double temperature;
    private double finalVolume;
    private double heatCapacity;

    public CylinderCompressedInternalEnergy(double moles, double temperature, double finalVolume, double heatCapacity) {
        this.moles = moles;
        this.temperature = temperature;
        this.finalVolume = finalVolume;
        this.heatCapacity = heatCapacity;
    }

    private double calc() {
        double energy;
        double temperature2;
        double finalTemp;

        temperature2 = temperature*finalVolume;

        finalTemp = temperature2-temperature;

        energy = moles*(heatCapacity)*finalTemp;

        return energy/1000;
    }

    public static void main(String[] args) {
        CylinderCompressedInternalEnergy cylinderCompressedInternalEnergy = new CylinderCompressedInternalEnergy(19, 318, 0.64, 24);
        System.out.println(cylinderCompressedInternalEnergy.calc());
    }
}
