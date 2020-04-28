package physics.assignments.fluidsAndElasticity;

public class MetalSphereWaterCordTension {

    private double mass;
    private double density;

    public MetalSphereWaterCordTension(double mass, double density) {
        this.mass = mass;
        this.density = density;
    }

    private double calc() {
        double tension;
        double weight;
        double w;

        weight = mass*9.8;

        w = weight/(density/1000);

        tension = weight - w;

        return tension;
    }

    public static void main(String[] args) {
        MetalSphereWaterCordTension metalSphereWaterCordTension = new MetalSphereWaterCordTension(7.41, 2291.24);
        System.out.println(metalSphereWaterCordTension.calc());
    }
}
