
package main.java.homework_7;

public abstract class Fish extends Animal {
    private String gills;
    private String scales;
    private String fins;
    private String color;
    public Fish(){
        super();
    }
    public Fish(String gills, String scales, String fins, String color) {
        this.gills = gills;
        this.scales = scales;
        this.fins = fins;
        this.color = color;
    }

    public String getGills() {
        return gills;
    }

    public String getScales() {
        return scales;
    }

    public String getFins() {
        return fins;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void spawn();


}
