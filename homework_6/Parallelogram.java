<<<<<<< HEAD
package main.java.homework_6;

public class Parallelogram extends Figure {
    private double firstCoupleSides;
    private double secondCoupleSides;
    public Parallelogram(String name, double firstCoupleSides, double secondCoupleSides) {
        super(name);
        this.firstCoupleSides = firstCoupleSides;
        this.secondCoupleSides = secondCoupleSides;
    }
    @Override
    void showName() {
        System.out.println(name + " з бічними сторонами " + firstCoupleSides +
                " та з основами " + secondCoupleSides);
    }

    public double getFirstCoupleSides() {
        return firstCoupleSides;
    }

    public void setFirstCoupleSides(double firstCoupleSides) {
        this.firstCoupleSides = firstCoupleSides;
    }

    public double getSecondCoupleSides() {
        return secondCoupleSides;
    }

    public void setSecondCoupleSides(double secondCoupleSides) {
        this.secondCoupleSides = secondCoupleSides;
    }
}
=======
package main.java.homework_6;

public class Parallelogram extends Figure {
    private double firstCoupleSides;
    private double secondCoupleSides;
    public Parallelogram(String name, double firstCoupleSides, double secondCoupleSides) {
        super(name);
        this.firstCoupleSides = firstCoupleSides;
        this.secondCoupleSides = secondCoupleSides;
    }
    @Override
    void showName() {
        System.out.println(name + " з бічними сторонами " + firstCoupleSides +
                " та з основами " + secondCoupleSides);
    }

    public double getFirstCoupleSides() {
        return firstCoupleSides;
    }

    public void setFirstCoupleSides(double firstCoupleSides) {
        this.firstCoupleSides = firstCoupleSides;
    }

    public double getSecondCoupleSides() {
        return secondCoupleSides;
    }

    public void setSecondCoupleSides(double secondCoupleSides) {
        this.secondCoupleSides = secondCoupleSides;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
