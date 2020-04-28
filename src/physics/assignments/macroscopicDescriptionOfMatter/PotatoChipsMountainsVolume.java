package physics.assignments.macroscopicDescriptionOfMatter;

public class PotatoChipsMountainsVolume {

    private double chipsVolume;
    private double seaTemperature;
    private double mountainTemperature;
    private double mountainPressure;

    public PotatoChipsMountainsVolume(double chipsVolume, double seaTemperature, double mountainTemperature, double mountainPressure) {
        this.chipsVolume = chipsVolume;
        this.seaTemperature = seaTemperature;
        this.mountainTemperature = mountainTemperature;
        this.mountainPressure = mountainPressure;
    }

    private double calc() {
        double newVolume;

        newVolume = ((1.01*Math.pow(10, 5)*chipsVolume) / (mountainPressure*Math.pow(10, 3))) * ((mountainTemperature+273.15) / (seaTemperature+273.15));

        return newVolume;
    }

    public static void main(String[] args) {
        PotatoChipsMountainsVolume potatoChipsMountainsVolume = new PotatoChipsMountainsVolume(1.53, 18.9, 8.45, 53.8);
        System.out.println(potatoChipsMountainsVolume.calc());
    }
}
