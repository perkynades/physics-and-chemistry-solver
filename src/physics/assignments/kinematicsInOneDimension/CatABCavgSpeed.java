package physics.assignments.kinematicsInOneDimension;

public class CatABCavgSpeed {

    private double distAC;
    private double distBC;
    private double timeAB;
    private double timeBC;

    public CatABCavgSpeed(double distAC, double distBC, double timeAB, double timeBC) {
        this.distAC = distAC;
        this.distBC = distBC;
        this.timeAB = timeAB;
        this.timeBC = timeBC;
    }

    private double calc() {
        double avgVelocity;

        avgVelocity = (((distAC + distBC) + distBC) / (timeAB + timeBC));

        return avgVelocity;
    }

    public static void main(String[] args) {
        CatABCavgSpeed catABCavgVelocity = new CatABCavgSpeed(5.2, 8.1, 19.65, 8.19);
        System.out.println(catABCavgVelocity.calc());
    }
}
