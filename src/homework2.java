import java.util.EmptyStackException;
import java.time.*;

public class homework2 {
    public static void zadan1(int clientOS, int clientDeviceYear) {
        if (String.valueOf(clientDeviceYear).isEmpty()) {
            clientDeviceYear = LocalDate.now().getYear();}
            if (clientOS == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS о ссылке");
                }
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    public static void zadan3(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");
    }
    public static void zadan4(int deliveryDistance){

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }
        else System.out.println("Потребуется дней: " + 3);
    }
    public static void zadan5(){
        int mouthNumber = 8;
        switch (mouthNumber){
            case  (1):
                System.out.println("January");
                break;
            case (2):
                System.out.println("febrary");
                break;
            case (3):
                System.out.println("mart");
                break;
            case (4):
                System.out.println("april");
                break;
            case (5):
                System.out.println("mai");
                break;
            case (6):
                System.out.println("june");
                break;
            case (7):
                System.out.println("jule");
                break;
            case (8):
                System.out.println("august");
                break;
            case (9):
                System.out.println("semtember");
                break;
            case (10):
                System.out.println("oktyabr");
                break;
            case (11):
                System.out.println("noyabr");
                break;
            case (12):
                System.out.println("decamber");
                break;

        }
    }
    public static void zadan6(){
        int age = 19;
        double salary = 58000;
        if (age < 23){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
        }
    }
}