package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class SteadyRateOfHeatPaneOfGlass {

    private double dist1;
    private double dist2;
    private double thickness;
    private double outsideTemp;
    private double insideTemp;

    public SteadyRateOfHeatPaneOfGlass(double dist1, double dist2, double thickness, double outsideTemp, double insideTemp) {
        this.dist1 = dist1;
        this.dist2 = dist2;
        this.thickness = thickness;
        this.outsideTemp = outsideTemp;
        this.insideTemp = insideTemp;
    }

    private double calc() {
        double rate;

        rate = 0.105*(dist1/100)*(dist2/100)*((insideTemp-(outsideTemp)) / (thickness/1000));

        return rate;
    }

    public static void main(String[] args) {
        SteadyRateOfHeatPaneOfGlass steadyRateOfHeatPaneOfGlass = new SteadyRateOfHeatPaneOfGlass(46, 34, 4, -12, 20);
        System.out.println(steadyRateOfHeatPaneOfGlass.calc());
    }
}
