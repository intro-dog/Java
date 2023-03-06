package main.java.homework_7;

public class Barge extends WaterTransport implements Swimming{
    private String size;

    public Barge(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void swim() {
        System.out.println("Barge is swimming");
    }

    @Override
    public void move() {
        System.out.println("Barge is able to move on water");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
