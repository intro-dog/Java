package main.java.homework_7;

public abstract class WaterTransport extends Transport{
    private String steeringWheel;
    private String type;
    private String color;
    public WaterTransport(String steeringWheel, String type, String color) {
        this.steeringWheel = steeringWheel;
        this.type = type;
        this.color = color;
    }
    public WaterTransport(){
        super();
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
