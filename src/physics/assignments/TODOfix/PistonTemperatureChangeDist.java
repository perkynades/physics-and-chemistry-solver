package physics.assignments.TODOfix;

/**
 * TODO: FIX AND PUT IN MACROSCOPIC DESCRIPTION OF MATTER
 */
public class PistonTemperatureChangeDist {

    private double mass;
    private double mol;
    private double initTemp;
    private double finalTemp;
    private double diameter;

    public PistonTemperatureChangeDist(double mass, double mol, double initTemp, double finalTemp, double diameter) {
        this.mass = mass;
        this.mol = mol;
        this.initTemp = initTemp;
        this.finalTemp = finalTemp;
        this.diameter = diameter;
    }

    private double calc() {
        double initHeight;
        double finalHeight;
        double changeHeight;
        double pressure;
        double absolutePressure;
        double volume1;
        double volume2;

        pressure = (mass*9.8)/(Math.PI*Math.pow((diameter/2)/100, 2));

        absolutePressure = pressure + 101300;

        volume1 = (mol*8.314*initTemp) / absolutePressure;

        initHeight = volume1 / (Math.PI*Math.pow((diameter/2)/100, 2));

        volume2 = volume1*(finalTemp+273.15) / initTemp;

        finalHeight = volume2/(Math.PI*Math.pow((diameter/2)/100, 2));

        changeHeight = finalHeight - initHeight;

        return changeHeight;
    }

    public static void main(String[] args) {
        PistonTemperatureChangeDist pistonTemperatureChangeDist = new PistonTemperatureChangeDist(50, 0.7, 258.15, 50, 10);
        System.out.println(pistonTemperatureChangeDist.calc());
    }
}
