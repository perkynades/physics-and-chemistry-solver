package physics.assignments.dynamicsMotionInAPlane;

public class TwoWireUpperTension {

    private double mass;
    private double speed;

    public TwoWireUpperTension(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    private double calc() {
        double tension;

        tension = ((mass/1000)*((2*Math.pow(speed, 2)) + (3*9.8))) / 3;

        return tension;
    }

    public static void main(String[] args) {
        TwoWireUpperTension twoWireUpperTension = new TwoWireUpperTension(774, 7);
        System.out.println(twoWireUpperTension.calc());
    }
}
