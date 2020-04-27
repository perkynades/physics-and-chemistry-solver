package physics.assignments.newtonsThirdLaw;

public class OnePulleyThreeBlockHangingTension {

    private double bigMass;
    private double smallMass;
    private double force;

    public OnePulleyThreeBlockHangingTension(double bigMass, double smallMass, double force) {
        this.bigMass = bigMass;
        this.smallMass = smallMass;
        this.force = force;
    }

    private double calc() {
        double tension;

        tension = ((bigMass*(force-(smallMass*9.8))) / smallMass) + (bigMass*9.8) + force;

        return tension;
    }

    public static void main(String[] args) {
        OnePulleyThreeBlockHangingTension onePulleyThreeBlockHangingTension = new OnePulleyThreeBlockHangingTension(15, 10, 133);
        System.out.println(onePulleyThreeBlockHangingTension.calc());
    }
}
