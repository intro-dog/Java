package main.java.homework_5;

public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit("Vlad",80000,24,730,365,0.01);
        System.out.print(credit1.calculateFinalLoanAmount());
    }

}