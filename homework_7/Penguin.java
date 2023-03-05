package main.java.homework_7;

public class Penguin extends Flightless implements Running{
    private String size;

    public Penguin(String type, String color, String size) {
        super(type, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The penguin is eating");
    }

    @Override
    public void layEggs() {
        System.out.println("The penguin is laying eggs");
    }

    @Override
    public void run() {
        System.out.println("The penguin is running");
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
