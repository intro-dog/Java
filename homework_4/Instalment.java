package main.java.homework_4;
import java.util.Scanner;

public class Instalment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть загальну суму кредиту: ");
        double credit = sc.nextDouble();

        System.out.print("Загальний відсоток (вказати у десятковій формі): ");
        double tax = sc.nextDouble();

        System.out.print("1.Розрахувати кількість щомісячного платежу," +
                " 2.Розрахувати суму щомісячного платежу: ");
        int chooseOption = sc.nextInt();


        if ( chooseOption == 1 ) {

            System.out.print("Введіть суму місячного платежу: ");
            int monthlyPay = sc.nextInt();

            int payments = 0;

            while ( credit > 0  ) {
                credit = (credit * ( 1 + tax)) - monthlyPay;
               payments++;
            }

            System.out.println( "Кількість платежів: " + payments );

        } else if ( chooseOption == 2 ) {
            System.out.print("Введіть кількість платежів: ");
            int countPay = sc.nextInt();

            double monthlyPayment = credit * ( tax / (1 - Math.pow( 1 + tax, -countPay )));

            System.out.println("Сума щомісячного платежу: " + monthlyPayment);
        };


    }
}














