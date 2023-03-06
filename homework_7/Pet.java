package main.java.homework_7;

public abstract class Pet extends Animal {
    private String type;
    private String color;
    private String nickName;

    public Pet(String type, String color, String nickName) {
        this.type = type;
        this.color = color;
        this.nickName = nickName;
    }
    public Pet() {
        super();
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    abstract public void bearAYoung();
}
