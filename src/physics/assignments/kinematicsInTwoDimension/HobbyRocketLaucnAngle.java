package physics.assignments.kinematicsInTwoDimension;

public class HobbyRocketLaucnAngle {

    private double height;
    private double dist;

    public HobbyRocketLaucnAngle(double height, double dist) {
        this.height = height;
        this.dist = dist;
    }

    private double calc() {
        double angle;

        angle = Math.atan(4*(height/dist))*57.29;

        return angle;
    }

    public static void main(String[] args) {
        HobbyRocketLaucnAngle hobbyRocketLaucnAngle = new HobbyRocketLaucnAngle(62.3, 100);
        System.out.println(hobbyRocketLaucnAngle.calc());
    }
}
