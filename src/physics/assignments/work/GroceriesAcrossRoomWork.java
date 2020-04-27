package physics.assignments.work;

public class GroceriesAcrossRoomWork {

    private double mass;
    private double speed;
    private double dist;

    public GroceriesAcrossRoomWork(double mass, double speed, double dist) {
        this.mass = mass;
        this.speed = speed;
        this.dist = dist;
    }

    private double calc() {
        double work;

        work = (0.5*mass*Math.pow(speed/100, 2)) - (0.5*mass*Math.pow(speed/100, 2));

        return work;
    }

    public static void main(String[] args) {
        GroceriesAcrossRoomWork groceriesAcrossRoomWork = new GroceriesAcrossRoomWork(5.8, 40, 4.2);
        System.out.println(groceriesAcrossRoomWork.calc());
    }
}
