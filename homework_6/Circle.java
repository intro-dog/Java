package main.java.homework_6;

public class Circle extends Figure {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    void showName() {
        System.out.println(name + " з радіусом " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
