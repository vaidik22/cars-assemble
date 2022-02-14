public class CarsAssemble {
    private static final int CARS_PRODUCED_EACH_HOUR = 221;

    private double calculateEfficiency(int assemblyLineSpeed) {
        if (assemblyLineSpeed >= 1 && assemblyLineSpeed <= 4) {
            return 1.0;
        } else if (assemblyLineSpeed >= 5 && assemblyLineSpeed <= 8) {
            return 0.9;
        } else if (assemblyLineSpeed == 9) {
            return 0.8;
        } else if (assemblyLineSpeed == 10) {
            return 0.77;
        } else return 0.0;
    }

    public double productionRatePerHour(int speed) {
        return speed * CARS_PRODUCED_EACH_HOUR * calculateEfficiency(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return Double.valueOf(productionRatePerHour(speed) / 60).intValue();
    }
}

