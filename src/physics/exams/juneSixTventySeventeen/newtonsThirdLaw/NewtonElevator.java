package physics.exams.juneSixTventySeventeen.newtonsThirdLaw;


/*
    En person med tyngde F_g = 600N står på en vekt inne i en heis. Idet heisen begynner å bevege
    seg, viser vekta 400N.

    A) Regn ut akselerasjonen(størrelse og retning) til heisen
 */

public class NewtonElevator {

    private double initWeight;
    private double movementWeight;
    private double gravity;

    public NewtonElevator(double initWeight, double movementWeight, double gravity) {
        this.initWeight = initWeight;
        this.movementWeight = movementWeight;
        this.gravity = gravity;
    }

    private double calc() {
        double acceleration;

        acceleration = ((initWeight - movementWeight) * gravity)/initWeight;

        return acceleration;
    }

    public static void main(String[] args) {
        NewtonElevator newtonElevator = new NewtonElevator(600, 400, 9.81);
        System.out.println(newtonElevator.calc());
    }

}
