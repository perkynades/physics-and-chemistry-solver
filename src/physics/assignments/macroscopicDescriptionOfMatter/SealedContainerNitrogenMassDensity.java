package physics.assignments.macroscopicDescriptionOfMatter;

public class SealedContainerNitrogenMassDensity {

    private double moles;
    private double pressure;
    private double temperature;

    public SealedContainerNitrogenMassDensity(double moles, double pressure, double temperature) {
        this.moles = moles;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    private double calc() {
        double density;
        double volume;

        volume = (moles*8.314*temperature) / (pressure*101325);

        density = (28*moles) / volume;

        return density/1000;
    }

    public static void main(String[] args) {
        SealedContainerNitrogenMassDensity sealedContainerNitrogenMassDensity = new SealedContainerNitrogenMassDensity(0.028, 1, 251);
        System.out.println(sealedContainerNitrogenMassDensity.calc());
    }
}
