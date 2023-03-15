import java.time.LocalDate;
import java.util.Scanner;

public class HomeWork {
    static Scanner scanner = new Scanner(System.in);
    public static int enteringData() {
        return scanner.nextInt();
    }
    public static String checkingNameOs() {
        String nameOs = scanner.next();
        String iOs = "ios";
        String android = "android";
        if (nameOs.equalsIgnoreCase(iOs)) {
            nameOs = String.valueOf(0);
        }
        if (nameOs.equalsIgnoreCase(android)) {
            nameOs = String.valueOf(1);
        }
        return nameOs;
    }
    public static void main(String[] args) {
        int year = 0;
        definitionYear(year);
        int nameOs = 0;
        int yearOs = 0;
        choosingOs(nameOs, yearOs);
        deliveryTime();
    }

    private static void definitionYear(int year) {
        System.out.println("Задача 1");
        System.out.println("Введите год для проверки високостности - ");
        year = enteringData();
        if (year / 4 % 4 == 0 && year / 100 % 100 != 0 || year / 400 % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void choosingOs(int nameOs, int yearOs) {
        System.out.println("Задача 2");
        System.out.println("Введите опарационную систему iOS или Android - ");
        nameOs = Integer.parseInt(checkingNameOs());
        System.out.println("Введите год выпуска - ");
        yearOs = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        if (nameOs == 0) {
            if (yearOs < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложение для iOS по ссылке");
            }
        }
        if (nameOs == 1) {
            if (yearOs < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложение для Android по ссылке");
            }
        }
    }

    public static int deliveryTime() {
        System.out.println("Задача 3");
        int deliveryDistance = enteringData();
        int daysDelivery = 1;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: " + daysDelivery);
        else if (deliveryDistance < 60) {
            daysDelivery = daysDelivery + 1;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance <= 100) {
            daysDelivery = daysDelivery + 2;
            System.out.println("Потребуется дней: " + daysDelivery);
        }
        else System.out.println("Доставки нет !");
        return daysDelivery;
    }
}
