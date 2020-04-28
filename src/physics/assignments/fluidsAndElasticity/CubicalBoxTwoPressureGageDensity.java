package physics.assignments.fluidsAndElasticity;

public class CubicalBoxTwoPressureGageDensity {

    private double dist;
    private double topPressure;
    private double bottomPressure;

    public CubicalBoxTwoPressureGageDensity(double dist, double topPressure, double bottomPressure) {
        this.dist = dist;
        this.topPressure = topPressure;
        this.bottomPressure = bottomPressure;
    }

    private double calc() {
        double density;

        density = (bottomPressure-topPressure) / (9.8*(dist/100));

        return density;
    }

    public static void main(String[] args) {
        CubicalBoxTwoPressureGageDensity cubicalBoxTwoPressureGageDensity = new CubicalBoxTwoPressureGageDensity(6.5, 581.05, 1220.23);
        System.out.println(cubicalBoxTwoPressureGageDensity.calc());
    }
}
