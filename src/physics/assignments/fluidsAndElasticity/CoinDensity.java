package physics.assignments.fluidsAndElasticity;

public class CoinDensity {

    private double diameter;
    private double thickness;
    private double weight;

    public CoinDensity(double diameter, double thickness, double weight) {
        this.diameter = diameter;
        this.thickness = thickness;
        this.weight = weight;
    }

    private double calc() {
        double density;
        double mass;
        double volume;

        mass = weight / 9.8;

        volume = Math.PI*((Math.pow(diameter/2, 2))/1000)*(thickness/1000);

        density = mass / volume;

        return density;
    }

    public static void main(String[] args) {
        CoinDensity coinDensity = new CoinDensity(20.75, 2.08, 0.05324);
        System.out.println(coinDensity.calc());
    }
}
