package main.java.homework_7;

public class Straus extends Flightless implements Running{
    private String size;

    public Straus(String type, String color, String size) {
        super(type, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The straus is eating");
    }

    @Override
    public void layEggs() {
        System.out.println("The straus is laying eggs");
    }

    @Override
    public void run() {
        System.out.println("The straus is running");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
