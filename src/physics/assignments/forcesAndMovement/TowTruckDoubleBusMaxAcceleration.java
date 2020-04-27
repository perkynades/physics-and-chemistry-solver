package physics.assignments.forcesAndMovement;

public class TowTruckDoubleBusMaxAcceleration {

    private double maxAcceleration;

    public TowTruckDoubleBusMaxAcceleration(double maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    private double calc() {
        double newAcceleration;

        newAcceleration = maxAcceleration / 3;

        return newAcceleration;
    }

    public static void main(String[] args) {
        TowTruckDoubleBusMaxAcceleration towTruckDoubleBusMaxAcceleration = new TowTruckDoubleBusMaxAcceleration(3.4);
        System.out.println(towTruckDoubleBusMaxAcceleration.calc());
    }
}
