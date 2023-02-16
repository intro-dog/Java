package main.java.homework_2;

import java.util.Scanner;
public class Salary{
    public static void main (String[] args){
        int week = 45; // кількість робочих годин на тиждень;
        int hour = 532; // вартість 1 години;
        double percent = 0.4; // відсоток податку;
        int month = week * 4; // кількість робочих годин на місяць;
        int year = month * 12; // кількість робочих годин на рік;

        System.out.println("Зарплатня на місяць без податків: " + month * hour);
        System.out.println("Зарплатня на місяць з податками: " + ((month * hour) - (month * hour * percent)));
        System.out.println("Зарплатня на рік без податків: " + year * hour);
        System.out.println("Зарплатня на рік з податками: " + ((year * hour) - (year * hour * percent)));
    }
}
