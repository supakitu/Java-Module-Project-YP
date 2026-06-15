import java.util.Scanner;

public class Main {
    Car[] cars = new Car[3];
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======================================================================\n" +
                           "                          24 часа Ле-Мана                              \n" +
                           "                               v1.0                                   \n" +
                           "======================================================================\n");

    }

    public static void getCarInfo() {
        while (true) {
            for (int i = 0; i < 3; i++) {
                System.out.println("- Введите имя машины №" + i + ":");
            }
        }

    }
}