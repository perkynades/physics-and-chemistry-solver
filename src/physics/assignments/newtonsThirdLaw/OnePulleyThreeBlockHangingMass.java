package physics.assignments.newtonsThirdLaw;

public class OnePulleyThreeBlockHangingMass {

    private double bigMass;
    private double smallMass;
    private double force;

    public OnePulleyThreeBlockHangingMass(double bigMass, double smallMass, double force) {
        this.bigMass = bigMass;
        this.smallMass = smallMass;
        this.force = force;
    }

    private double calc() {
        double tension;
        double acceleration;
        double mass;

        tension = (5*force) / 2;

        acceleration = (force - (smallMass*9.8)) / smallMass;

        mass = tension / (9.8 - acceleration);

        return mass;
    }

    public static void main(String[] args) {
        OnePulleyThreeBlockHangingMass onePulleyThreeBlockHangingMass = new OnePulleyThreeBlockHangingMass(15, 10, 133);
        System.out.println(onePulleyThreeBlockHangingMass.calc());
    }
}
