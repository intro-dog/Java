<<<<<<< HEAD
package main.java.homework_7;

public class InflatableBoat extends WaterTransport implements Swimming{
    private String size;

    public InflatableBoat(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void swim() {
        System.out.println("Inflatable boat is swimming");
    }

    @Override
    public void move() {
        System.out.println("Inflatable boat is able to move on water");
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

public class InflatableBoat extends WaterTransport implements Swimming{
    private String size;

    public InflatableBoat(String steeringWheel, String type, String color, String size) {
        super(steeringWheel, type, color);
        this.size = size;
    }

    @Override
    public void swim() {
        System.out.println("Inflatable boat is swimming");
    }

    @Override
    public void move() {
        System.out.println("Inflatable boat is able to move on water");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
