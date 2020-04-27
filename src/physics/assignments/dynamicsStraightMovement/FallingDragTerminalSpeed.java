package physics.assignments.dynamicsStraightMovement;

public class FallingDragTerminalSpeed {

    private double mass;
    private double acceleration;
    private double speed;

    public FallingDragTerminalSpeed(double mass, double acceleration, double speed) {
        this.mass = mass;
        this.acceleration = acceleration;
        this.speed = speed;
    }

    private double calc() {
        double netForce;
        double dragForce;
        double totalForce;
        double terminalVelocity;
        double cd;

        netForce = mass*acceleration;

        dragForce = mass * 9.8;

        totalForce = dragForce - netForce;

        cd = totalForce / (Math.pow(speed, 2));

        terminalVelocity = Math.sqrt((mass*9.8) / cd);

        return terminalVelocity;
    }

    public static void main(String[] args) {
        FallingDragTerminalSpeed fallingDragTerminalSpeed = new FallingDragTerminalSpeed(34.5, 3.44, 49.7);
        System.out.println(fallingDragTerminalSpeed.calc());
    }
}
