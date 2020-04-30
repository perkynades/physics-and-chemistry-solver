package physics.assignments.workHeatAndTheFirstLawOfThermodynamics;

public class IdealGasBallonOutsideGasWork {

    private double volumeChange;
    private double initPressure;
    private double initVolume;

    public IdealGasBallonOutsideGasWork(double volumeChange, double initPressure, double initVolume) {
        this.volumeChange = volumeChange;
        this.initPressure = initPressure;
        this.initVolume = initVolume;
    }

    private double calc() {
        double work;

        work = initPressure*initVolume*Math.log(volumeChange);

        return work;
    }

    public static void main(String[] args) {
        IdealGasBallonOutsideGasWork idealGasBallonOutsideGasWork = new IdealGasBallonOutsideGasWork(6, 645, 0.1);
        System.out.println(idealGasBallonOutsideGasWork.calc());
    }
}
