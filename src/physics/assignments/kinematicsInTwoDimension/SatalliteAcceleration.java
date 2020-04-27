package physics.assignments.kinematicsInTwoDimension;

public class SatalliteAcceleration {

    private double distFromEarth;
    private double earthRadius;
    private double time;

    public SatalliteAcceleration(double distFromEarth, double earthRadius, double time) {
        this.distFromEarth = distFromEarth;
        this.earthRadius = earthRadius;
        this.time = time;
    }

    private double calc() {
        double acceleration;
        double u;

        u = (2*Math.PI*(distFromEarth+earthRadius)) / (time*60*60);

        acceleration = Math.pow(u, 2) / (distFromEarth + earthRadius);

        return acceleration;
    }

    public static void main(String[] args) {
        SatalliteAcceleration satalliteAcceleration = new SatalliteAcceleration(2.16*Math.pow(10, 7), 5.56*Math.pow(10, 6), 8.06);
        System.out.println(satalliteAcceleration.calc());
    }
}
