package physics.assignments.fluidsAndElasticity;

public class RockSuspendedInWaterScaleDensity {

    private double initWeight;
    private double finalWeight;

    public RockSuspendedInWaterScaleDensity(double initWeight, double finalWeight) {
        this.initWeight = initWeight;
        this.finalWeight = finalWeight;
    }

    private double calc() {
        double massChange;
        double volume;
        double density;

        massChange = (initWeight/9.8) - (finalWeight/9.8);

        volume = massChange/1000;

        density = (initWeight/9.8) / (volume);

        return density;
    }

    public static void main(String[] args) {
        RockSuspendedInWaterScaleDensity rockSuspendedInWaterScaleDensity = new RockSuspendedInWaterScaleDensity(19.27, 13.45);
        System.out.println(rockSuspendedInWaterScaleDensity.calc());
    }
}
