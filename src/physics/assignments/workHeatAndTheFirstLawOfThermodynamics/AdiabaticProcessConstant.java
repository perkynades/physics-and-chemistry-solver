package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class AdiabaticProcessConstant {

    private double finalPressure;
    private double finalVolume;

    public AdiabaticProcessConstant(double finalPressure, double finalVolume) {
        this.finalPressure = finalPressure;
        this.finalVolume = finalVolume;
    }

    private double calc() {
        double constant;

        constant = (Math.log(finalPressure))/(Math.log(finalVolume));

        return -constant;
    }

    public static void main(String[] args) {
        AdiabaticProcessConstant adiabaticProcessConstant = new AdiabaticProcessConstant(1.5, 0.514);
        System.out.println(adiabaticProcessConstant.calc());
    }
}
