package main.java.homework_6;

public class EquilateralTriangle extends Figure {
    private double side;
    public EquilateralTriangle(String name, double side) {
        super(name);
        this.side = side;
    }
    @Override
    void showName() {
        System.out.println(name + " зі сторонами: " + side);
    }
}
