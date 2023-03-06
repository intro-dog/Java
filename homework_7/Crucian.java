<<<<<<< HEAD
package main.java.homework_7;

public class Crucian extends Fish implements Swimming{
    private String size;
    public Crucian(String gills, String scales, String fins, String color, String size) {
        super(gills, scales, fins, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The crucian is eating");
    }

    @Override
    public void spawn() {
        System.out.println("The crucian is spawning");
    }

    @Override
    public void swim() {
        System.out.println("The crucian is swimming");
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

public class Crucian extends Fish implements Swimming{
    private String size;
    public Crucian(String gills, String scales, String fins, String color, String size) {
        super(gills, scales, fins, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The crucian is eating");
    }

    @Override
    public void spawn() {
        System.out.println("The crucian is spawning");
    }

    @Override
    public void swim() {
        System.out.println("The crucian is swimming");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
