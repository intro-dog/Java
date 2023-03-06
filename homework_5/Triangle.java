package main.java.homework_5;
public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public double perimeterTriangle() {
        return firstSide + secondSide + thirdSide;
    }
    public double calculateSquare() {
        double s = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }
}
