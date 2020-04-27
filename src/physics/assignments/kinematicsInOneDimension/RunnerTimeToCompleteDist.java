package physics.assignments.kinematicsInOneDimension;

public class RunnerTimeToCompleteDist {

    private double dist;
    private double endSpeed;

    public RunnerTimeToCompleteDist(double dist, double endSpeed) {
        this.dist = dist;
        this.endSpeed = endSpeed;
    }

    private double calc() {
        double time;
        double acceleration;

        acceleration = ((Math.pow(endSpeed, 2) - Math.pow(0, 2))) / (2 * dist);

        time = endSpeed / acceleration;

        return time;
    }

    public static void main(String[] args) {
        RunnerTimeToCompleteDist runnerTimeToCompleteDist = new RunnerTimeToCompleteDist(82.7, 8.98);
        System.out.println(runnerTimeToCompleteDist.calc());
    }
}
