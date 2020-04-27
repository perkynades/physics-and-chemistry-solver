package physics.assignments.kinematicsInOneDimension;

public class PackageHeightDropHelicopterMovingUp {

    private double upWardSpeed;
    private double time;

    public PackageHeightDropHelicopterMovingUp(double upWardSpeed, double time) {
        this.upWardSpeed = upWardSpeed;
        this.time = time;
    }

    private double calc() {
        double height;

        height = -((upWardSpeed*time) + (0.5*(-9.8)*Math.pow(time, 2)));

        return height;
    }

    public static void main(String[] args) {
        PackageHeightDropHelicopterMovingUp packageHeightDropHelicopterMovingUp = new PackageHeightDropHelicopterMovingUp(15, 13);
        System.out.println(packageHeightDropHelicopterMovingUp.calc());
    }
}
