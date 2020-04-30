package physics.assignments.TODOfix;

/**
 * TODO: FIX AND AND PUT IN WORK, HEAT AND THE FIRST LAW OF THERMODYNAMICS
 */
public class WaterVaporizedAddedHeat {

    private double mass;
    private double initTemperature;
    private double specificHeat;
    private double heatFusion;
    private double heat;

    public WaterVaporizedAddedHeat(double mass, double initTemperature, double specificHeat, double heatFusion, double heat) {
        this.mass = mass;
        this.initTemperature = initTemperature;
        this.specificHeat = specificHeat;
        this.heatFusion = heatFusion;
        this.heat = heat;
    }

    private double calc() {
        double heatReq;
        double heat1;

        heatReq = mass*((specificHeat*1) + heat);

        return heatReq;
    }

    public static void main(String[] args) {
        WaterVaporizedAddedHeat waterVaporizedAddedHeat = new WaterVaporizedAddedHeat(3, 0, 1, 80, 539);
        System.out.println(waterVaporizedAddedHeat.calc());
    }
}
