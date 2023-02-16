package main.java.homework_4;

import java.util.Arrays;

public class Salary {
    public static void main (String[] args) {

        int salaryHour = 20;
        double tax = 0.3;

        int day = salaryHour * 8;

        int january = day * 23;
        int february = day * 20;
        int march = day * 22;
        int april = day * 21;
        int may = day * 23;
        int june = day * 21;
        int july = day * 22;
        int august = day * 23;
        int september = day * 20;
        int october = day * 23;
        int november = day * 22;
        int december = day * 21;
        int sum = (january + february + march + april + may + june + july
        + august + september + october + november + december);

            System.out.print("Січень: " + january + " " + "\n");
            System.out.print("Лютий: " + february + " " + "\n");
            System.out.print("Березень: " + march + " " + "\n");
            System.out.print("Квітень: " + april + " " + "\n");
            System.out.print("Травень: " + may + " " + "\n");
            System.out.print("Червень: " + june + " " + "\n");
            System.out.print("Липень: " + july + " " + "\n");
            System.out.print("Серпень: " + august + " " + "\n");
            System.out.print("Вересень: " + september + " " + "\n");
            System.out.print("Жовтень: " + october + " " + "\n");
            System.out.print("Листопад: " + november + " " + "\n");
            System.out.print("Грудень: " + december + " " + "\n");
            System.out.print("Всього з податком: " + sum + "\n");
            System.out.print("Всього без податку: " + (sum - (sum * tax) + "\n"));
        }
}
