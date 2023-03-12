package main.java.homework_8;

public enum Size {
    S("S", 20, 35),
    M("M", 30, 45),
    XL("XL", 40, 55);
    private String abbreviation;
    private int width;
    private int length;
    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }
    String getAbbreviation() {
        return abbreviation;
    }
    int getWidth() {
        return width;
    }
    int getLength() {
        return length;
    }


}
