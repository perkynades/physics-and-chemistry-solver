package physics.assignments.rotationOfRigidBody;

public class StudentExperimentApparatusRetardingTorque {

    private double rpm;
    private double revolutions;
    private double inertia;

    public StudentExperimentApparatusRetardingTorque(double rpm, double revolutions, double inertia) {
        this.rpm = rpm;
        this.revolutions = revolutions;
        this.inertia = inertia;
    }

    private double calc() {
        double angVelocity;
        double angTheta;
        double angAcceleration;
        double torque;

        angVelocity = (2*Math.PI*rpm) / 60;

        angTheta = 2*Math.PI*revolutions;

        angAcceleration = (Math.pow(angVelocity, 2)) / (2*angTheta);

        torque = inertia*angAcceleration;

        return torque*1000000;
    }

    public static void main(String[] args) {
        StudentExperimentApparatusRetardingTorque studentExperimentApparatusRetardingTorque = new StudentExperimentApparatusRetardingTorque(30, 240, 0.085);
        System.out.println(studentExperimentApparatusRetardingTorque.calc());
    }
}
