package physics.assignments.fluidsAndElasticity;

public class BargeInWaterWeight {

    private double width;
    private double length;
    private double below;

    public BargeInWaterWeight(double width, double length, double below) {
        this.width = width;
        this.length = length;
        this.below = below;
    }

    private double calc() {
        double mass;

        mass = 1000*9.8*(width*length*below);

        return mass/1000000;
    }

    public static void main(String[] args) {
        BargeInWaterWeight bargeInWaterWeight = new BargeInWaterWeight(21.23, 84.27, 1.32);
        System.out.println(bargeInWaterWeight.calc());
    }
}
