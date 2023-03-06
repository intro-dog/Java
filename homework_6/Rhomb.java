package main.java.homework_6;

public class Rhomb extends Figure{
    private double side;
    public Rhomb(String name, double side) {
        super(name);
        this.side = side;
    }
    @Override
    void showName() {
        System.out.println(name + " з сторонами " + side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
