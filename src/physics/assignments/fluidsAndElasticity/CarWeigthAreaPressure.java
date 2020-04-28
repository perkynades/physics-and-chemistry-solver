package physics.assignments.fluidsAndElasticity;

public class CarWeigthAreaPressure {

    private double mass;
    private double area;

    public CarWeigthAreaPressure(double mass, double area) {
        this.mass = mass;
        this.area = area;
    }

    private double calc() {
        double pressure;

        pressure = ((mass*Math.pow(10, 3))*9.8) / (4*(area*Math.pow(10, -2)));

        return (pressure - (1.01*Math.pow(10, 5))) /1000000;
    }

    public static void main(String[] args) {
        CarWeigthAreaPressure carWeigthAreaPressure = new CarWeigthAreaPressure(1.54, 1.21);
        System.out.println(carWeigthAreaPressure.calc());
    }
}
