<<<<<<< HEAD
package main.java.homework_7;

public class Helicopter extends AirTransport implements Flying{
    private String size;

    public Helicopter(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }
    @Override
    public void move() {
        System.out.println("Helicopter is able to move by air");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
=======
package main.java.homework_7;

public class Helicopter extends AirTransport implements Flying{
    private String size;

    public Helicopter(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }
    @Override
    public void move() {
        System.out.println("Helicopter is able to move by air");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
