package main.java.homework_7;

public class Dog extends Pet implements Running{
    private String size;

    public Dog(String type, String color, String nickName, String size) {
        super(type, color, nickName);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void bearAYoung() {
        System.out.println("The dog is able to bear a young");
    }

    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
