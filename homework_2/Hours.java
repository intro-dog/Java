package main.java.homework_2;
import java.util.Scanner;
public class Hours {
    public static void main (String... args){
        Scanner hours = new Scanner(System.in);
        System.out.print("Введіть кількість робочих годин на тиждень: ");
        int week = hours.nextInt();
        System.out.print("Введіть зарплатню з податком: ");
        int yearPDV = hours.nextInt();
        System.out.print("Введіть відсоток податку: ");
        double percent = hours.nextDouble();
        double differencePercent = 1 - percent; // різниця податку;
        int month = week * 4; // кількість робочих годин на місяць;

        System.out.print("При " + week + " робочих годин на тиждень з річною зарплатею в " + yearPDV +
                " та податком " + percent + "%" + " година часу коштує " + ((yearPDV / differencePercent / month) / 12));
    }
}

