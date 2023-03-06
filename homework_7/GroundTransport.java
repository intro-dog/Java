package main.java.homework_7;

public abstract class GroundTransport extends Transport{
    private String wheels;
    private String steeringWheel;
    private String type;
    private String color;

    public GroundTransport(String wheels, String steeringWheel, String type, String color) {
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.type = type;
        this.color = color;
    }
    public GroundTransport(){
        super();
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
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
