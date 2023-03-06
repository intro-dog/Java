<<<<<<< HEAD
package main.java.homework_6;

public class Trapeze extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;

    public Trapeze(String name, double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }
    @Override
    void showName() {
        System.out.println(name + " з бічними сторонами " + firstSide +
                " та " + thirdSide +
                " з основами " + secondSide + " та " + fourthSide );
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getFourthSide() {
        return fourthSide;
    }

    public void setFourthSide(double fourthSide) {
        this.fourthSide = fourthSide;
    }
}
=======
package main.java.homework_6;

public class Trapeze extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;

    public Trapeze(String name, double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }
    @Override
    void showName() {
        System.out.println(name + " з бічними сторонами " + firstSide +
                " та " + thirdSide +
                " з основами " + secondSide + " та " + fourthSide );
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getFourthSide() {
        return fourthSide;
    }

    public void setFourthSide(double fourthSide) {
        this.fourthSide = fourthSide;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
