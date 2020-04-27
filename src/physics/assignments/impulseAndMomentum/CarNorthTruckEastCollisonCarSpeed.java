package physics.assignments.impulseAndMomentum;

public class CarNorthTruckEastCollisonCarSpeed {

    private double speed;
    private double angel;

    public CarNorthTruckEastCollisonCarSpeed(double speed, double angel) {
        this.speed = speed;
        this.angel = angel;
    }

    private double calc() {
        double initSpeed;

        initSpeed = 2*(speed*Math.sin(Math.toRadians(angel)));

        return initSpeed;
    }

    public static void main(String[] args) {
        CarNorthTruckEastCollisonCarSpeed carNorthTruckEastCollisonCarSpeed = new CarNorthTruckEastCollisonCarSpeed(28, 43);
        System.out.println(carNorthTruckEastCollisonCarSpeed.calc());
    }
}
