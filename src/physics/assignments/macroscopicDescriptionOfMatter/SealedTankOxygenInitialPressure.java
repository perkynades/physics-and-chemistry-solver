package physics.assignments.macroscopicDescriptionOfMatter;

public class SealedTankOxygenInitialPressure {

    private double tankVolume;
    private double moles;
    private double initTemperature;
    private double finalTemperature;

    public SealedTankOxygenInitialPressure(double tankVolume, double moles, double initTemperature, double finalTemperature) {
        this.tankVolume = tankVolume;
        this.moles = moles;
        this.initTemperature = initTemperature;
        this.finalTemperature = finalTemperature;
    }

    private double calc() {
        double pressure;

        pressure = (moles*8.314*initTemperature) / (tankVolume*1000*1000);

        return pressure;
    }

    public static void main(String[] args) {
        SealedTankOxygenInitialPressure sealedTankOxygenInitialPressure = new SealedTankOxygenInitialPressure(96.19, 5086.76, 275.14, 443.66);
        System.out.println(sealedTankOxygenInitialPressure.calc());
    }
}
