package physics.assignments.kinematicsInOneDimension;

public class CatABCavgVelocity {

    private double distAC;
    private double distBC;
    private double timeAB;
    private double timeBC;

    public CatABCavgVelocity(double distAC, double distBC, double timeAB, double timeBC) {
        this.distAC = distAC;
        this.distBC = distBC;
        this.timeAB = timeAB;
        this.timeBC = timeBC;
    }

    private double calc() {
        double avgVelocity;

        avgVelocity = ((-(distAC + distBC) + distBC) / (timeAB + timeBC));

        return avgVelocity;
    }

    public static void main(String[] args) {
        CatABCavgVelocity catABCavgVelocity = new CatABCavgVelocity(7.16, 19.3, 20.7, 8.65);
        System.out.println(catABCavgVelocity.calc());
    }
}
