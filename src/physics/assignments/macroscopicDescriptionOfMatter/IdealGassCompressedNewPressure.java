package physics.assignments.macroscopicDescriptionOfMatter;

public class IdealGassCompressedNewPressure {

    private double pressure;
    private double iniVolume;
    private double finalVolume;

    public IdealGassCompressedNewPressure(double pressure, double iniVolume, double finalVolume) {
        this.pressure = pressure;
        this.iniVolume = iniVolume;
        this.finalVolume = finalVolume;
    }

    private double calc() {
        double newPressure;

        newPressure = (pressure*iniVolume)/finalVolume;

        return newPressure/10;
    }

    public static void main(String[] args) {
        IdealGassCompressedNewPressure idealGassCompressedNewPressure = new IdealGassCompressedNewPressure(1.19, 2.42, 1);
        System.out.println(idealGassCompressedNewPressure.calc());
    }
}
