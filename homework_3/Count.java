package main.java.homework_3;
import java.util.Scanner;

public class  Count {
    public static void main(String... args) {
        Scanner counter = new Scanner(System.in);
        int count;
        boolean simple = true; // число просте
        System.out.print("Введіть будь-яке число: ");
        int figure = counter.nextInt();

        for (int i=2; i * i < figure; i++) {
            count = figure % i;
            if (count == 0) {
                simple = false;
            }
        }

        if (figure % 2 == 0 ) {
            System.out.println("Парне число");
        } else {
            System.out.println("Непарне число");
        }
        if (figure >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Від'ємне число");
        }
        if (simple && figure != 1 && figure > 1 && figure != 0) {
            System.out.println("Просте число");
        } else if (simple && figure == 1 || figure == 0){
            System.out.println("Не відноситься до Простого або Складеного числа");
        } else if (simple && figure <= -1 ){
            System.out.println("Для визначення \"Простого\" чи \"Складеного\" числа введіть будь-яке \"Додатнє\" число");
        } else {
            System.out.println("Складене число");
        }
    }
}




