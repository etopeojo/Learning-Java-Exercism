public class CarsAssemble {

    private final double ratePerHour = 221;

    public double productionRatePerHour(int speed) {
        double successRate = 0.0;
        if (speed >= 1 && speed <= 4) {
            successRate = 100.0 / 100.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 90.0 / 100.0;
        } else if (speed == 9) {
            successRate = 80.0 / 100.0;
        } else {
            successRate = 77.0 / 100.0;
        }

        System.out.println("Success rate: " + successRate);
        return successRate * (speed * ratePerHour);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    // public static void main(String[] args) {
    // CarsAssemble carsAssemble = new CarsAssemble();

    // System.out.println("Production rate per hour for speed 0: " +
    // carsAssemble.productionRatePerHour(0));
    // System.out.println("Production rate per hour for speed 1: " +
    // carsAssemble.productionRatePerHour(1));
    // System.out.println("Production rate per hour for speed 4: " +
    // carsAssemble.productionRatePerHour(4));
    // System.out.println("Production rate per hour for speed 6: " +
    // carsAssemble.productionRatePerHour(6));
    // System.out.println("Production rate per hour for speed 9: " +
    // carsAssemble.productionRatePerHour(9));
    // System.out.println("Production rate per hour for speed 10: " +
    // carsAssemble.productionRatePerHour(10));
    // }
}
