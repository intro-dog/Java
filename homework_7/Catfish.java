<<<<<<< HEAD
package main.java.homework_7;

public class Catfish extends Fish implements Swimming{
    private String size;
    public Catfish(String gills, String scales, String fins, String color, String size) {
        super(gills, scales, fins, color);
        this.size = size;
    }
    @Override
    public void swim() {
        System.out.println("The catfish is swimming");
    }
    @Override
    public void eat() {
        System.out.println("The catfish is eating");
    }
    @Override
    public void spawn() {
        System.out.println("The catfish is spawning");
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

public class Catfish extends Fish implements Swimming{
    private String size;
    public Catfish(String gills, String scales, String fins, String color, String size) {
        super(gills, scales, fins, color);
        this.size = size;
    }
    @Override
    public void swim() {
        System.out.println("The catfish is swimming");
    }
    @Override
    public void eat() {
        System.out.println("The catfish is eating");
    }
    @Override
    public void spawn() {
        System.out.println("The catfish is spawning");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
>>>>>>> bd3c5ca9fe62d8d4f3c7c103907484d76382bd0b
