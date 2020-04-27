package physics.assignments.dynamicsStraightMovement;

public class ObjectFallingDragForce {

    private double mass;
    private double terminalSpeed;
    private double speed;

    public ObjectFallingDragForce(double mass, double terminalSpeed, double speed) {
        this.mass = mass;
        this.terminalSpeed = terminalSpeed;
        this.speed = speed;
    }

    private double calc() {
        double force;
        double k;

        k = mass * (9.8/terminalSpeed);

        force = k*speed;

        return force;
    }

    public static void main(String[] args) {
        ObjectFallingDragForce objectFallingDragForce = new ObjectFallingDragForce(31, 87.5, 36.7);
        System.out.println(objectFallingDragForce.calc());
    }
}
