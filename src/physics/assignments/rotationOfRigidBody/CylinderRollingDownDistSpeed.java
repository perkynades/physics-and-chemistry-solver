package physics.assignments.rotationOfRigidBody;

public class CylinderRollingDownDistSpeed {

    private double mass;
    private double angle;
    private double dist;

    public CylinderRollingDownDistSpeed(double mass, double angle, double dist) {
        this.mass = mass;
        this.angle = angle;
        this.dist = dist;
    }

    private double calc() {
        double height;
        double speed;

        height = dist*Math.sin(Math.toRadians(angle));

        speed = Math.sqrt((4*9.8*height)/3);

        return speed;
    }

    public static void main(String[] args) {
        CylinderRollingDownDistSpeed cylinderRollingDownDistSpeed = new CylinderRollingDownDistSpeed(5.5, 27.9, 3.12);
        System.out.println(cylinderRollingDownDistSpeed.calc());
    }
}
