package main.java.homework_7;

public class HotAirBaloon extends AirTransport implements Flying{
    private String size;

    public HotAirBaloon(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void fly() {
        System.out.println("Hot air baloon is flying");
    }

    @Override
    public void move() {
        System.out.println("Hot air baloon is able to move by air");
    }
}
