package physics.assignments.forcesAndMovement;

public class ObjectFallingdragTerminalSpeed {

    private double force;
    private double b;

    public ObjectFallingdragTerminalSpeed(double force, double b) {
        this.force = force;
        this.b = b;
    }

    private double calc() {
        double termSpeed;

        termSpeed = Math.sqrt(force / b);

        return termSpeed;
    }

    public static void main(String[] args) {
        ObjectFallingdragTerminalSpeed objectFallingdragTerminalSpeed = new ObjectFallingdragTerminalSpeed(4.45, 3.83);
        System.out.println(objectFallingdragTerminalSpeed.calc());
    }
}
