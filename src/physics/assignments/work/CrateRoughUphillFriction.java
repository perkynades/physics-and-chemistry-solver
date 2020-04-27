package physics.assignments.work;

public class CrateRoughUphillFriction {

    private double mass;
    private double angle;
    private double force;
    private double dist;
    private double initSpeed;
    private double finalSpeed;

    public CrateRoughUphillFriction(double mass, double angle, double force, double dist, double initSpeed, double finalSpeed) {
        this.mass = mass;
        this.angle = angle;
        this.force = force;
        this.dist = dist;
        this.initSpeed = initSpeed;
        this.finalSpeed = finalSpeed;
    }

    private double calc() {
        double kinEnergy;
        double friction;

        kinEnergy = (0.5*mass*Math.pow(finalSpeed, 2)) - (0.5*mass*Math.pow(initSpeed, 2));

        friction = (((force*Math.cos(Math.toRadians(angle)))-(mass*9.8*Math.sin(Math.toRadians(angle))))*dist) - kinEnergy;

        return -friction;
    }

    public static void main(String[] args) {
        CrateRoughUphillFriction crateRoughUphillFriction = new CrateRoughUphillFriction(837, 30, 7154, 3, 1.7, 2.2);
        System.out.println(crateRoughUphillFriction.calc());
    }
}
