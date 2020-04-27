package physics.assignments.kinematicsInTwoDimension;

public class RiverFlowSpeedRate {

    private double angle;
    private double constRate;

    public RiverFlowSpeedRate(double angle, double constRate) {
        this.angle = angle;
        this.constRate = constRate;
    }

    private double calc() {
        double riverFlow;

        riverFlow = constRate*Math.cos(angle*0.0174);

        return riverFlow;
    }

    public static void main(String[] args) {
        RiverFlowSpeedRate riverFlowSpeedRate = new RiverFlowSpeedRate(28, 1.5);
        System.out.println(riverFlowSpeedRate.calc());
    }
}
