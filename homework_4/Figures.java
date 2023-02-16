package main.java.homework_4;
import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Яку фігуру вивести? ");
            String figure = sc.nextLine();

            String rectangle = "Прямокутник";
            String rightTriangle = "Прямокутний трикутник";
            String rightReverseTriangle = "Зворотній прямокутний трикутник";
            String triangle = "Трикутник";

            if (figure.equals(rectangle)) {
                rectangle();
            } else if (figure.equals(rightTriangle)) {
                rightTriangle();
            } else if (figure.equals(rightReverseTriangle)) {
                rightReverseTriangle();
            } else if (figure.equals(triangle)) {
                triangle();
            }

            System.out.print("Бажаєте вивести фігуру ще раз? ");
            String q = sc.nextLine();

            String answer = "Так";
            if (q.equals(answer)) {
            } else {
                System.out.print("Дякую!");
                break;
            }

        }  while (true);
    }

        public static void rightReverseTriangle() {
            Scanner figures = new Scanner(System.in);
            System.out.print("Введіть висоту: ");
            int height = figures.nextInt();
            int k = 2 * height - 2;
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= k; j++) {
                    System.out.print(" ");
                }
                k = k - 2;
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                }
                System.out.println();
            }
    }
        public static void rectangle() {
            Scanner figures = new Scanner(System.in);
            System.out.print("Введіть висоту: ");
            int height = figures.nextInt();
            System.out.print("Введіть довжину: ");
            int width = figures.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("* ");
                }
                    System.out.println();
            }
        }

        public static void rightTriangle() {
            Scanner figures = new Scanner(System.in);
            System.out.print("Введіть висоту: ");
            int height = figures.nextInt();

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void triangle() {
            Scanner figures = new Scanner(System.in);
            System.out.print("Введіть висоту: ");
            int height = figures.nextInt();

            for (int i = 1; i <= height; i++) {
                for (int j = i; j < height; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }

