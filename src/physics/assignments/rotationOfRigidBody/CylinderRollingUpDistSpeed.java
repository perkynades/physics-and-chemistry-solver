package physics.assignments.rotationOfRigidBody;

public class CylinderRollingUpDistSpeed {

    private double speed;
    private double angle;
    private double dist;

    public CylinderRollingUpDistSpeed(double speed, double angle, double dist) {
        this.speed = speed;
        this.angle = angle;
        this.dist = dist;
    }

    private double calc() {
        double initKinetic;
        double finalSpeed;
        double height;

        height = dist*Math.sin(Math.toRadians(angle));

        finalSpeed = Math.sqrt(Math.pow(speed, 2) - ((10*9.8*height) / 7));

        return finalSpeed;
    }

    public static void main(String[] args) {
        CylinderRollingUpDistSpeed cylinderRollingDownDistSpeed = new CylinderRollingUpDistSpeed(5.5, 27.9, 3.12);
        System.out.println(cylinderRollingDownDistSpeed.calc());
    }
}
