package main.java.homework_7;

abstract class Flightless extends Animal {
    private String type;
    private String color;

    public Flightless(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract public void layEggs();
}
