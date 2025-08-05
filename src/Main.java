public class Main {
    //task 1
    public static void calculationLeapYear(int year) {
        boolean calculationLeapYear = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        System.out.println(year + " год — " + (calculationLeapYear ? "является високосным годом" : "является невисокосным годом"));
    }

    //task 2
    public static void installAppVersion(int osType, int clientDeviceYear) {
        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Неизвестный тип ОС");
            return;
        }

        String version = (clientDeviceYear < 2015) ? "облегченную версию " : "";
        System.out.println("Установите " + version + "приложения для " + osName + " по ссылке");
    }

    //task 3
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 0) {
            return -1;
        } else if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        calculationLeapYear(1754);

        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        installAppVersion(0, clientDeviceYear);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryDays(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("Доставка по адресу невозможна");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}
