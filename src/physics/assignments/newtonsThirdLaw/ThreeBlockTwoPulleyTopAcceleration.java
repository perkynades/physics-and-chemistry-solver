package physics.assignments.newtonsThirdLaw;

public class ThreeBlockTwoPulleyTopAcceleration {

    private double mass1;
    private double mass2;
    private double mass3;
    private double coefficient;

    public ThreeBlockTwoPulleyTopAcceleration(double mass1, double mass2, double mass3, double coefficient) {
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.mass3 = mass3;
        this.coefficient = coefficient;
    }

    private double calc() {
        double acceleration;

        acceleration = 9.8*((mass3-mass1-(coefficient*mass2)) / (mass3+mass2+mass1));

        return acceleration;
    }

    public static void main(String[] args) {
        ThreeBlockTwoPulleyTopAcceleration threeBlockTwoPulleyTopAcceleration = new ThreeBlockTwoPulleyTopAcceleration(1, 2, 3, 0.29);
        System.out.println(threeBlockTwoPulleyTopAcceleration.calc());
    }
}
