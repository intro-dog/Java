package main.java.homework_7;

public class Pigeon extends Bird implements Flying{
    private String size;

    public Pigeon(String feathers, String beak, String color, String size) {
        super(feathers, beak, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The pigeon is eating");
    }

    @Override
    public void layEggs() {
        System.out.println("The pigeon is laying eggs");
    }

    @Override
    public void fly() {
        System.out.println("The pigeon is flying");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
