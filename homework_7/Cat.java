<<<<<<< HEAD
package main.java.homework_7;

public class Cat extends Pet implements Running{
    private String size;

    public Cat(String type, String color, String nickName, String size) {
        super(type, color, nickName);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void bearAYoung() {
        System.out.println("The cat is able to bear a young");
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
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

public class Cat extends Pet implements Running{
    private String size;

    public Cat(String type, String color, String nickName, String size) {
        super(type, color, nickName);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void bearAYoung() {
        System.out.println("The cat is able to bear a young");
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
