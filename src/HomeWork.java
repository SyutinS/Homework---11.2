import java.time.LocalDate;
import java.util.Scanner;

public class HomeWork {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork checkingYear = new HomeWork();
        System.out.println("Задача 1");
        System.out.println("Введите год для проверки високостности - ");
        int year = scanner.nextInt();
        checkingYear.definitionYear(year);

        HomeWork lookingOs = new HomeWork();
        System.out.println("Задача 2");
        System.out.println("Введите опарационную систему iOS или Android - ");
        String nameOs = scanner.next();
        String iOs = "ios";
        String android = "android";
        if (nameOs.equalsIgnoreCase(iOs)) {
            nameOs = String.valueOf(0);
        }
        if (nameOs.equalsIgnoreCase(android)) {
            nameOs = String.valueOf(1);
        }
        System.out.println("Введите год выпуска - ");
        int yearOs = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        lookingOs.choosingOs(Integer.parseInt(nameOs), yearOs, currentYear);

        int deliveryDistance = 95;
        int daysDelivery = 1;
        deliveryTeam(deliveryDistance, daysDelivery);
    }

    private void definitionYear(int year) {
        if ((year / 4 % 4 == 0 && year / 100 % 100 != 0) || (year / 400 % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public int choosingOs(int nameOs, int yearOs, int currentYear) {
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
        return nameOs;
    }

    public static int deliveryTeam(int deliveryDistance, int daysDelivery) {//calculationDaysDistance() {
        System.out.println("Задача 3");
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: " + daysDelivery);
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            System.out.println("Потребуется дней: " + (daysDelivery + 1));
        else if (deliveryDistance >= 60 && deliveryDistance <= 100)
            System.out.println("Потребуется дней: " + (daysDelivery + 2));
        else System.out.println("Доставки нет !");
        return deliveryDistance;
    }
}
