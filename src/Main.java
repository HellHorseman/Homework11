import java.util.Scanner;

public class Main {
    public static void initLeapYear() {
        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void checkDevice() {
        int clientOs = 0;
        int clientDeviceYear = 2010;
        boolean old = (clientDeviceYear <= 2015);
        if (clientOs == 0 && old) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && old) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите дистанцию");
        int distance = scanner.nextInt();
        return distance;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        initLeapYear();
    }

    public static void task2() {
        System.out.println("Задача 2");
        checkDevice();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = deliveryDistance();
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = days + 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}