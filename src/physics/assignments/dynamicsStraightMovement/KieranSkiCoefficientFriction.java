package physics.assignments.dynamicsStraightMovement;

public class KieranSkiCoefficientFriction {

    private double height;
    private double angle;
    private double thrust;
    private double mass;
    private double speed;

    public KieranSkiCoefficientFriction(double height, double angle, double thrust, double mass, double speed) {
        this.height = height;
        this.angle = angle;
        this.thrust = thrust;
        this.mass = mass;
        this.speed = speed;
    }

    private double calc() {
        double coefficient;
        double length;

        length = height / Math.sin(Math.toRadians(angle));

        coefficient = -(((mass*Math.pow(speed, 2)) - (2*mass*9.8*height) - (2*thrust*length)) / (2*mass*length*9.81*Math.cos(Math.toRadians(angle))));

        return coefficient;
    }

    public static void main(String[] args) {
        KieranSkiCoefficientFriction kieranSkiCoefficientFriction = new KieranSkiCoefficientFriction(49.8, 17.3, 206.9, 69.4, 29.6);
        System.out.println(kieranSkiCoefficientFriction.calc());
    }
}
