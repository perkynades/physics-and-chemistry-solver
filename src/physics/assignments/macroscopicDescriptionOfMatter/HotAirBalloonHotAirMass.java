package physics.assignments.macroscopicDescriptionOfMatter;

public class HotAirBalloonHotAirMass {

    private double volume;
    private double pressure;
    private double temperature;
    private double gasConstant;

    public HotAirBalloonHotAirMass(double volume, double pressure, double temperature, double gasConstant) {
        this.volume = volume;
        this.pressure = pressure;
        this.temperature = temperature;
        this.gasConstant = gasConstant;
    }

    private double calc() {
        double n;
        double mass;

        n = (pressure*volume) / (gasConstant*(temperature+273.15));

        mass = n * 28.8;

        return mass*100000;
    }

    public static void main(String[] args) {
        HotAirBalloonHotAirMass hotAirBalloonHotAirMass = new HotAirBalloonHotAirMass(2.83, 1.01, 100.8, 8.314);
        System.out.println(hotAirBalloonHotAirMass.calc());
    }
}
