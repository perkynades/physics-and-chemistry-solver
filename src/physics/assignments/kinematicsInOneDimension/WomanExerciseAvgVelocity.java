package physics.assignments.kinematicsInOneDimension;

public class WomanExerciseAvgVelocity {

    private double southSpeed;
    private double southTimeInMin;
    private double northDist;
    private double northTimeInMin;

    public WomanExerciseAvgVelocity(double southSpeed, double southTimeInMin, double northDist, double northTimeInMin) {
        this.southSpeed = southSpeed;
        this.southTimeInMin = southTimeInMin;
        this.northDist = northDist;
        this.northTimeInMin = northTimeInMin;
    }

    private double calc() {
        double acgVelocity;
        double southDist;

        southDist = southSpeed*southTimeInMin*60;

        acgVelocity = -(southDist - northDist) / ((southTimeInMin+northTimeInMin)*60);

        return acgVelocity;
    }

    public static void main(String[] args) {
        WomanExerciseAvgVelocity womanExerciseAvgVelocity = new WomanExerciseAvgVelocity(1.42, 56.9, 2713, 15.1);
        System.out.println("Negative because the of north being positive direction");
        System.out.println(womanExerciseAvgVelocity.calc());
    }
}
