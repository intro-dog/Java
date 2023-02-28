package main.java.homework_6;

public class Square extends Figure {
    private double side;
    private double degree;
    public Square(String name, double side, double degree) {
        super(name);
        this.side = side;
        this.degree = degree;
    }
    @Override
    void showName() {
        System.out.println(name + " зі сторонами " + side + " та " + degree +
                " градусів між кутами " );
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
