package physics.assignments.macroscopicDescriptionOfMatter;

public class WaterMoleculesMolesMolecules {

    private double volume;
    private double pressure;
    private double temperature;

    public WaterMoleculesMolesMolecules(double volume, double pressure, double temperature) {
        this.volume = volume;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    private double calc() {
        double moles;

        moles = ((pressure*Math.pow(10, 5))*volume) / (8.314*(temperature+273.15));

        return moles;
    }

    public static void main(String[] args) {
        WaterMoleculesMolesMolecules waterMoleculesMolesMolecules = new WaterMoleculesMolesMolecules(3.6, 6.86, 526.3);
        System.out.println(waterMoleculesMolesMolecules.calc());
    }
}
