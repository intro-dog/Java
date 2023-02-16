package main.java.homework_3;
import java.util.Scanner;
public class Cost {
    public static void main(String... args) {
        Scanner cost = new Scanner(System.in);
        int price = 122; // ціна за товар
        System.out.print("Введіть кількість товару: ");
        int product = cost.nextInt();

        if (product > 10 && product < 20) {
            System.out.println("Ваша сума: " + (price - (price * 0.05)));
        }
        if (product > 20 && product <= 30 ) {
            System.out.println("Ваша сума: " + (price - (price * 0.1)));
        }
        if (product >= 31 && product < 41) {
            System.out.println("Ваша сума: " + (price - (price * 0.12)));
        } else if (product >= 41 && product < 51) {
            System.out.println("Ваша сума: " + (price - (price * 0.124)));
        } else if (product >= 51 && product < 61) {
            System.out.println("Ваша сума: " + (price - (price * 0.128)));
        } else if ((product >= 61 && product < 71)) {
            System.out.println("Ваша сума: " + (price - (price * 0.132)));
        } else if ((product >= 71 && product < 81)) {
            System.out.println("Ваша сума: " + (price - (price * 0.136)));
        }
        if (product >= 81) {
            System.out.println("Ваша сума: " + (price - (price * 0.13)));
        }

    }
}