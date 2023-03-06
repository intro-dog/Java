<<<<<<< HEAD
package main.java.homework_7;

public class Car extends GroundTransport{
    private String size;

    public Car(String wheels, String steeringWheel, String type, String color, String size) {
        super(wheels, steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
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

public class Car extends GroundTransport{
    private String size;

    public Car(String wheels, String steeringWheel, String type, String color, String size) {
        super(wheels, steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
