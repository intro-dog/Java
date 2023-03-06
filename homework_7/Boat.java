package main.java.homework_7;

public class Boat extends WaterTransport implements Swimming{
    private String size;

    public Boat(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void swim() {
        System.out.println("Boat is swimming");
    }

    @Override
    public void move() {
        System.out.println("Boat is able to move on water");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
