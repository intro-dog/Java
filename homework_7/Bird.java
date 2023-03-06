package main.java.homework_7;

public abstract class Bird extends Animal {
    private String feathers;
    private String beak;
    private String color;
    public Bird(String feathers, String beak, String color) {
        this.feathers = feathers;
        this.beak = beak;
        this.color = color;
    }
    public Bird(){
        super();
    }

    abstract public void layEggs();

}
