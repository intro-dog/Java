<<<<<<< HEAD
package main.java.homework_6;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    public Rectangle(String name, double firstSide, double secondSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    @Override
    void showName() {
        System.out.println(name + " з висотою " + firstSide +
                " та довжиною " + secondSide);
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
}
=======
package main.java.homework_6;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    public Rectangle(String name, double firstSide, double secondSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    @Override
    void showName() {
        System.out.println(name + " з висотою " + firstSide +
                " та довжиною " + secondSide);
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
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
