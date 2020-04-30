package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class GasAdiabaticallyFinalTemperature {

    private double y;
    private double temperature;
    private double initVolume;
    private double finalVolume;

    public GasAdiabaticallyFinalTemperature(double y, double temperature, double initVolume, double finalVolume) {
        this.y = y;
        this.temperature = temperature;
        this.initVolume = initVolume;
        this.finalVolume = finalVolume;
    }

    private double calc() {
        double finalTemp;

        finalTemp = (temperature+273)*Math.pow(initVolume/finalVolume, y-1);

        return finalTemp-273;
    }

    public static void main(String[] args) {
        GasAdiabaticallyFinalTemperature gasAdiabaticallyFinalTemperature = new GasAdiabaticallyFinalTemperature(1.77, 1.3, 9.8, 10.4);
        System.out.println(gasAdiabaticallyFinalTemperature.calc());
    }
}
