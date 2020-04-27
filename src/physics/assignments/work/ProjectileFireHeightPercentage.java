package physics.assignments.work;

public class ProjectileFireHeightPercentage {

    private double angle;
    private double speed;
    private double percentage;

    public ProjectileFireHeightPercentage(double angle, double speed, double percentage) {
        this.angle = angle;
        this.speed = speed;
        this.percentage = percentage;
    }

    private double calc() {
        double result;

        result = Math.sqrt(((1-percentage)*Math.pow(speed, 2)*Math.pow(Math.sin(angle), 2)) + (Math.pow(speed, 2)*Math.pow(Math.cos(angle), 2)));

        return result;
    }

    public static void main(String[] args) {
        ProjectileFireHeightPercentage projectileFireHeightPercentage = new ProjectileFireHeightPercentage(28.44, 20.8, 0.2);
        System.out.println(projectileFireHeightPercentage.calc());
    }
}
