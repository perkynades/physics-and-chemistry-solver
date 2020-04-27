package physics.assignments.kinematicsInOneDimension;

public class WomanExerciseAvgSpeed {

    private double southSpeed;
    private double southTimeInMin;
    private double northDist;
    private double northTimeInMin;

    public WomanExerciseAvgSpeed(double southSpeed, double southTimeInMin, double northDist, double northTimeInMin) {
        this.southSpeed = southSpeed;
        this.southTimeInMin = southTimeInMin;
        this.northDist = northDist;
        this.northTimeInMin = northTimeInMin;
    }

    private double calc() {
        double avgSpeed;
        double southDist;

        southDist = 60 * southTimeInMin * southSpeed;

        avgSpeed = (northDist + southDist) / ((southTimeInMin + northTimeInMin)*60);

        return avgSpeed;
    }

    public static void main(String[] args) {
        WomanExerciseAvgSpeed womanExerciseAvgSpeed = new WomanExerciseAvgSpeed(1.6, 49.3, 3260, 28.3);
        System.out.println(womanExerciseAvgSpeed.calc());
    }
}
