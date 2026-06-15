import java.util.Scanner;

public class Main {
    public static Car[] cars = new Car[3];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
            "======================================================================\n" +
            "                          24 часа Ле-Мана                              \n" +
            "                               v1.0                                   \n" +
            "======================================================================\n"
        );

        cars = new Car[]{createCar(1)};
        cars = new Car[]{createCar(2)};
        cars = new Car[]{createCar(3)};
    }

    private static Car createCar(int number) {
        String name;
        int speed;

        System.out.println("- Введите имя машины №" + number + ":");
        name = scanner.next();

        while (true) {
            System.out.println("- Введите скорость машины №" + number + ":");
            speed = scanner.nextInt();

            if (speed > 0 && speed <= 250) {
                break;
            } else {
                System.out.println("Скорость машины не может быть меньше 0 или больше 250");
            }
        }

        return new Car(name, speed);
    }


}