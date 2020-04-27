package physics.assignments.rotationOfRigidBody;

public class ChildsOnRodsBeamLength {

    private double beamMass;
    private double childMass1;
    private double childMass2;
    private double dist;

    public ChildsOnRodsBeamLength(double beamMass, double childMass1, double childMass2, double dist) {
        this.beamMass = beamMass;
        this.childMass1 = childMass1;
        this.childMass2 = childMass2;
        this.dist = dist;
    }

    private double calc() {
        double length;

        length = -(-(2*dist*childMass1*9.8) - (2*dist*beamMass) - (2*dist*childMass2*9.8)) / (beamMass+(2*childMass2*9.8));

        return length;
    }

    public static void main(String[] args) {
        ChildsOnRodsBeamLength childsOnRodsBeamLength = new ChildsOnRodsBeamLength(19.23, 25.47, 39.75, 1.1);
        System.out.println(childsOnRodsBeamLength.calc());
    }
}
