public class CarsAssemble {
    private static final int LOWEST_SPEED_PRODUCTION = 221;
    private static final double MAX_PERCENTS = 100.0;
    private static final int MINUTES_IN_HOUR = 60;
    public int success_rate = 100;
    public double productionRatePerHour(int speed) {
         if (speed >= 5 && speed <= 8) {
            success_rate = 90;
         } else if (speed == 9) {
             success_rate = 80;
         } else if (speed == 10) {
             success_rate = 77;
         }
        return (speed * LOWEST_SPEED_PRODUCTION * success_rate) /MAX_PERCENTS ;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed >= 5 && speed <= 8) {
            success_rate = 90;
        } else if (speed == 9) {
            success_rate = 80;
        } else if (speed == 10) {
            success_rate = 77;
        }
        return (int) ((success_rate * speed * LOWEST_SPEED_PRODUCTION) / MAX_PERCENTS) / MINUTES_IN_HOUR;
    }
}
