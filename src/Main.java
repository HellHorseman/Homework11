public class Main {
    public static void leapYear() {
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

    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Задача 1");
        leapYear();
    }

    public static void task2() {
        System.out.println("Задача 2");
        checkDevice();
    }
}