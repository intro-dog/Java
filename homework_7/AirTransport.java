package main.java.homework_7;

public abstract class AirTransport extends Transport{
    private String steeringWheel;
    private String type;
    private String color;
    public AirTransport(String steeringWheel, String type, String color) {
        this.steeringWheel = steeringWheel;
        this.type = type;
        this.color = color;
    }
    public AirTransport(){
        super();
    }
    public String getWheels() {
        return steeringWheel;
    }

    public void setWheels(String wheels) {
        this.steeringWheel = wheels;
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
