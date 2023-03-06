<<<<<<< HEAD
package main.java.homework_5;

public class Credit {

    private String nameOfCreditor;
    private int creditSum;
    private double percent;
    private int creditDay;
    private int countDayYear;
    private double commission;

    public Credit(String name, int creditSum, double percent, int creditDay, int countDayYear, double commission) {
        this.nameOfCreditor = name;
        this.creditSum = creditSum;
        this.percent = percent;
        this.creditDay = creditDay;
        this.countDayYear = countDayYear;
        this.commission = commission;
    }

    public String getNameOfCreditor() {
        return nameOfCreditor;
    }
    public int getCreditSum() {
        return creditSum;
    }
    public double getPercent() {
        return percent;
    }
    public int getCreditDay() {
        return creditDay;
    }
    public int getCountDayYear() {
        return countDayYear;
    }
    public double calculateFinalLoanAmount() {
        double calculateMonthlyCommission = creditSum * commission * percent;
        double calculateOverPayment = creditSum * percent / 100 * creditDay / countDayYear;
        return calculateMonthlyCommission + calculateOverPayment + creditSum;
    }

}
=======
package main.java.homework_5;

public class Credit {

    private String nameOfCreditor;
    private int creditSum;
    private double percent;
    private int creditDay;
    private int countDayYear;
    private double commission;

    public Credit(String name, int creditSum, double percent, int creditDay, int countDayYear, double commission) {
        this.nameOfCreditor = name;
        this.creditSum = creditSum;
        this.percent = percent;
        this.creditDay = creditDay;
        this.countDayYear = countDayYear;
        this.commission = commission;
    }

    public String getNameOfCreditor() {
        return nameOfCreditor;
    }
    public int getCreditSum() {
        return creditSum;
    }
    public double getPercent() {
        return percent;
    }
    public int getCreditDay() {
        return creditDay;
    }
    public int getCountDayYear() {
        return countDayYear;
    }
    public double calculateFinalLoanAmount() {
        double calculateMonthlyCommission = creditSum * commission * percent;
        double calculateOverPayment = creditSum * percent / 100 * creditDay / countDayYear;
        return calculateMonthlyCommission + calculateOverPayment + creditSum;
    }

}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
