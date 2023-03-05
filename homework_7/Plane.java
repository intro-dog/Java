package main.java.homework_7;

public class Plane extends AirTransport implements Flying{
    private String size;

    public Plane(double wheels, String type, String color, String size) {
        super(wheels, type, color);
        this.size = size;
    }
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void move() {
        System.out.println("Plane is able to move by air");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
