package physics.assignments.rotationOfRigidBody;

public class UniformSignWallForce {

    private double squareDist;
    private double mass;

    public UniformSignWallForce(double squareDist, double mass) {
        this.squareDist = squareDist;
        this.mass = mass;
    }

    private double calc() {
        double force;

        force = ((mass*9.8)*(squareDist/2)) / squareDist;

        return force;
    }

    public static void main(String[] args) {
        UniformSignWallForce uniformSignWallForce = new UniformSignWallForce(0.4, 3.6);
        System.out.println(uniformSignWallForce.calc());
    }
}
