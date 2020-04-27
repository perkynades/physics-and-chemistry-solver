package physics.assignments.newtonsThirdLaw;

public class SystemOfBlocksPulleyTension {

    private double mass1;
    private double mass2;
    private double hangingMass;
    private double angle;

    public SystemOfBlocksPulleyTension(double mass1, double mass2, double hangingMass, double angle) {
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.hangingMass = hangingMass;
        this.angle = angle;
    }

    private double calc() {
        double acceleration;
        double tension;

        acceleration = (mass2*9.8) /(mass1+mass2+hangingMass);

        tension = (mass1*acceleration) + (mass1*9.8*Math.sin(Math.sin(Math.toRadians(angle))));

        return tension;
    }

    public static void main(String[] args) {
        SystemOfBlocksPulleyTension systemOfBlocksPulleyTension = new SystemOfBlocksPulleyTension(6, 4, 9, 30);
        System.out.println(systemOfBlocksPulleyTension.calc());
    }
}
