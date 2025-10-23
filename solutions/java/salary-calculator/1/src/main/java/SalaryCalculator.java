public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? (100.0 - 15.0) / 100.0 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.0;
        double maxSalary = 2000.0;
        double salary;
        double salaryMultiplier = salaryMultiplier(daysSkipped);
        double bonusGotten = bonusForProductsSold(productsSold);

        salary = (baseSalary * salaryMultiplier) + bonusGotten;

        return salary > maxSalary ? maxSalary : salary;

    }
}
