package physics.assignments.macroscopicDescriptionOfMatter;

public class IdealGassContainerTemperature {

    private double moles;
    private double pressure;
    private double volume;

    public IdealGassContainerTemperature(double moles, double pressure, double volume) {
        this.moles = moles;
        this.pressure = pressure;
        this.volume = volume;
    }

    private double calc() {
        double temp;

        temp = (volume*pressure) / (moles*8.314);

        return temp-273.15;
    }

    public static void main(String[] args) {
        IdealGassContainerTemperature idealGassContainerTemperature = new IdealGassContainerTemperature(2.8, 234.6, 17.8);
        System.out.println(idealGassContainerTemperature.calc());
    }
}
