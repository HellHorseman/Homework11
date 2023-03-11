import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static int initLeapYear() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Укажите интересующий Вас год");
        int year = scanner1.nextInt();
        return year;
    }

    public static int checkOS() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("укажите тип OS: Mac - 0; Android - 1");
        int clientOs = scanner2.nextInt();
        if (clientOs == 0 || clientOs == 1) {
            return clientOs;
        } else {
            throw new RuntimeException("Указана не существующая OS");
        }
    }

    public static int checkDeviceYear() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Укажите год выпуска Вашего устройства");
        int clientDeviceYear = scanner3.nextInt();
        return clientDeviceYear;
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
        int year = initLeapYear();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = checkOS();
        int clientDeviceYear = checkDeviceYear();
        int currentYear = LocalDate.now().getYear();
        boolean old = (clientDeviceYear < currentYear);
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

    public static int task3() {
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
        return days;
    }
}