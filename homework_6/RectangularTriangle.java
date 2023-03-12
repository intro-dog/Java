
package main.java.homework_6;

public class RectangularTriangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double degree;
    public RectangularTriangle(String name, double firstSide, double secondSide, double thirdSide, double degree) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.degree = degree;
    }

    @Override
    void showName() {
        System.out.println(name);
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

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
