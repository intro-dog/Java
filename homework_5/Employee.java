package main.java.homework_5;

public class Employee {

    private String lastName;
    private String firstName;
    private String position;
    private int hourSalary;

    public Employee(String lastName, String firstName, String position, int hourSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.hourSalary = hourSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHourSalary() {
        return hourSalary;
    }
    public void setHourSalary(int hourSalary){
        this.hourSalary = hourSalary;
    }
}
