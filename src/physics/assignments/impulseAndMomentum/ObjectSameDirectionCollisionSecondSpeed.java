package physics.assignments.impulseAndMomentum;

public class ObjectSameDirectionCollisionSecondSpeed {

    private double speed1;
    private double speed2;

    public ObjectSameDirectionCollisionSecondSpeed(double speed1, double speed2) {
        this.speed1 = speed1;
        this.speed2 = speed2;
    }

    private double calc() {
        double trueSpeed;

        trueSpeed = speed1 - (2*speed2*speed1);

        return trueSpeed;
    }

    public static void main(String[] args) {
        ObjectSameDirectionCollisionSecondSpeed objectSameDirectionCollisionSecondSpeed = new ObjectSameDirectionCollisionSecondSpeed(1.043, 0.333);
        System.out.println(objectSameDirectionCollisionSecondSpeed.calc());
    }
}
