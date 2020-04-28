package physics.assignments.fluidsAndElasticity;

public class EmptyLungsInWaterDensity {

    private double weight;
    private double newWeight;

    public EmptyLungsInWaterDensity(double weight, double newWeight) {
        this.weight = weight;
        this.newWeight = newWeight;
    }

    private double calc() {
        double boynatForce;
        double volume;
        double mass;
        double density;

        boynatForce = weight - newWeight;

        volume = boynatForce / (1000*9.8);

        mass = weight / 9.8;

        density = mass / volume;

        return density;
    }

    public static void main(String[] args) {
        EmptyLungsInWaterDensity emptyLungsInWaterDensity = new EmptyLungsInWaterDensity(509.45, 22.34);
        System.out.println(emptyLungsInWaterDensity.calc());
    }
}
