package main.java.homework_3;

public class Month {
    public static void main(String[] args) {
       int month = 7; // номер місяця
        int hour = 20; // вартість години
        double tax = 0.3; // податок
        int day = hour * 8; // зарплатня за день за урахуванням вартості години

       switch (month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("Ваша зарплатня без податку: " + (day * 23));
               System.out.println("Ваша зарплатня з податком: " + ((day * 23) - (day * 23 * tax)));
               break;
           case 2:
               System.out.println("Ваша зарплатня без податку: " + (day * 20));
               System.out.println("Ваша зарплатня з податком: " + ((day * 20) - (day * 20 * tax)));
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("Ваша зарплатня без податку: " + (day * 22));
               System.out.println("Ваша зарплатня з податком: " + ((day * 22) - (day * 22 * tax)));
               break;
       }
    }
}
