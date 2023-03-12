
package main.java.homework_7;

public class Pike extends Fish implements Swimming{
    private String size;

    public Pike(String gills, String scales, String fins, String color, String size) {
        super(gills, scales, fins, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The pike is eating");
    }

    @Override
    public void spawn() {
        System.out.println("The pike is spawning");
    }

    @Override
    public void swim() {
        System.out.println("The pike is swimming");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
