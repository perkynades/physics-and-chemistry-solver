package physics.assignments.kinematicsInOneDimension;

public class ConstantAccelerationBreakTime {

    private double dist;
    private double startSpeed;
    private double time;

    public ConstantAccelerationBreakTime(double dist, double startSpeed, double time) {
        this.dist = dist;
        this.startSpeed = startSpeed;
        this.time = time;
    }

    private double calc() {
        double constAccceleration;
        double distAtBreak;

        distAtBreak = this.dist - (this.startSpeed * this.time);

        constAccceleration = -((-(Math.pow(startSpeed, 2))) / (2*distAtBreak));

        return constAccceleration;
    }

    public static void main(String[] args) {
        ConstantAccelerationBreakTime constantAccelerationBreakTime = new ConstantAccelerationBreakTime(212, 25.4, 0.236);
        System.out.println("Since asking for magnitude, it will be positive, even if direction is negative");
        System.out.println(constantAccelerationBreakTime.calc());
    }
}
