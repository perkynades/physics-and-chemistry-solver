package physics.exams.juneSixTventySeventeen.motionEquations;

/*
    En partikkel beveger seg i x.retningen og starter i origo. farten er gitt ved:
    v(t) = -7.0t^2 + 11t + 20, hvor t er tiden i sekunder.
    a) Hva er akselerasjonen etter 0.10s ?
    b) Hvor langt forfltter partikkelen seg mellom 0 s og 5.0s?
    GJELDER FOR ANDREGRADSLIKNINGER
 */

public class ParticleMovement {

    private double a;
    private double b;
    private double c;
    private double time;
    private double timex1;
    private double timex2;

    public ParticleMovement(double a, double b, double c, double time, double timex1, double timex2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.timex1 = timex1;
        this.timex2 = timex2;
        this.time = time;
    }

    /*
        DERIVER v(t) for å få a(t) (akselerasjon)
     */
    private double calcAcceleration() {
        double acceleration;

        acceleration = (a*2*time + b);

        return acceleration;
    }

    /*
        Integrer v(t) for å få s(t)
     */
    private double calcMovement (){
        double movement;
        movement = (((a/3)*Math.pow(timex1,3) + (b/2)* Math.pow(timex1, 2) + (c*timex1)) - ((a/3)*Math.pow(timex2,3) + (b/2)* Math.pow(timex2, 2) + (c*timex2)));
        return movement;
    }


    public static void main(String[] args) {
        ParticleMovement particleMovement = new ParticleMovement(-7, 11, 20, 0.10,5,0);
        System.out.println("Acceleration is: " + particleMovement.calcAcceleration() + "\n" + "Movement after x seconds: " + particleMovement.calcMovement());
    }

}
