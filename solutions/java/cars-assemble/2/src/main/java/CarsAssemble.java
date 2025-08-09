public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed > 0 && speed <= 4) {
            return speed * 221;
        }
        else if (speed > 4 && speed <= 8) {
            return (speed * 221) * 0.90;

        } else if (speed == 9) {
            return (speed * 221) * 0.80;
        }else {
            return (speed * 221) * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
            if (speed > 0 && speed <= 4) {
            return (speed * 221) / 60;
        }
        else if (speed > 4 && speed <= 8) {
            return (int) ((speed * 221) * 0.90) / 60;

        } else if (speed == 9) {
            return (int) ((speed * 221) * 0.80) / 60;
        }else {
            return (int) ((speed * 221) * 0.77) / 60;
        }
    }
}
