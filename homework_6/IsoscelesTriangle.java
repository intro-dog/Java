package main.java.homework_6;

public class IsoscelesTriangle extends Figure {
    private double basis;
    private double side;
    public IsoscelesTriangle(String name, double basis, double side) {
        super(name);
        this.basis = basis;
        this.side = side;
    }
    @Override
    void showName() {
      System.out.println( name + " зі сторонами " + side + " та основою " + basis);
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
