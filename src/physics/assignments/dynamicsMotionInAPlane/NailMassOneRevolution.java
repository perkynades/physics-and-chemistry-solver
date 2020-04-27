package physics.assignments.dynamicsMotionInAPlane;

public class NailMassOneRevolution {

    private double mass;
    private double dist;
    private double tension;

    public NailMassOneRevolution(double mass, double dist, double tension) {
        this.mass = mass;
        this.dist = dist;
        this.tension = tension;
    }

    private double calc() {
        double time;

        time = (2*Math.PI)*Math.sqrt((mass*dist)/tension);

        return time;
    }

    public static void main(String[] args) {
        NailMassOneRevolution nailMassOneRevolution = new NailMassOneRevolution(17, 1, 42);
        System.out.println(nailMassOneRevolution.calc());
    }
}
