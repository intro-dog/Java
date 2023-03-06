package main.java.homework_7;

public class Bus extends GroundTransport{
    private String size;

    public Bus(String wheels, String steeringWheel, String type, String color, String size) {
        super(wheels, steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void move() {
        System.out.println("Bus is moving");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
