package physics.assignments.macroscopicDescriptionOfMatter;

public class WeatherBaloonRiseNewVolume {

    private double volume1;
    private double temperature1;
    private double pressure1;
    private double temperature2;
    private double pressure2;

    public WeatherBaloonRiseNewVolume(double volume1, double temperature1, double pressure1, double temperature2, double pressure2) {
        this.volume1 = volume1;
        this.temperature1 = temperature1;
        this.pressure1 = pressure1;
        this.temperature2 = temperature2;
        this.pressure2 = pressure2;
    }

    private double calc() {
        double volume;

        volume = (pressure1*volume1*(273.15 + temperature2)) / ((273.15+temperature1)*pressure2);

        return volume;
    }

    public static void main(String[] args) {
        WeatherBaloonRiseNewVolume weatherBaloonRiseNewVolume = new WeatherBaloonRiseNewVolume(12.01, 19.38, 101, -32.26, 23.05);
        System.out.println(weatherBaloonRiseNewVolume.calc());
    }
}
