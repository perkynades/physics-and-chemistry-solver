package physics.assignments.work;

public class ThreeForcesThirdForceWork {

    private double force3;

    public ThreeForcesThirdForceWork(double force3) {
        this.force3 = force3;
    }

    private double calc() {
        double work;

        work = force3*0*Math.cos(90);

        return work;
    }

    public static void main(String[] args) {
        ThreeForcesThirdForceWork threeForcesThirdForceWork = new ThreeForcesThirdForceWork(14);
        System.out.println(threeForcesThirdForceWork.calc());
    }
}
