package physics.assignments.rotationOfRigidBody;

public class FigureSkaterArmsPulledAngularSpeed {

    private double rads;
    private double initInertia;
    private double finalInertia;

    public FigureSkaterArmsPulledAngularSpeed(double rads, double initInertia, double finalInertia) {
        this.rads = rads;
        this.initInertia = initInertia;
        this.finalInertia = finalInertia;
    }

    private double calc() {
        double angularSpeed;

        angularSpeed = (rads*initInertia) / finalInertia;

        return angularSpeed;
    }

    public static void main(String[] args) {
        FigureSkaterArmsPulledAngularSpeed figureSkaterArmsPulledAngularSpeed = new FigureSkaterArmsPulledAngularSpeed(2.53, 1.62, 1.65);
        System.out.println(figureSkaterArmsPulledAngularSpeed.calc());
    }
}
