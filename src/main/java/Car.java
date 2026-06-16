import java.util.Scanner;

public class Car {
    final String name;
    final int speed;
    private static final Scanner scanner = new Scanner(System.in);

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static Car createCar(int carNumber) {
        String name;
        int speed;

        System.out.println("- Введите имя машины №" + carNumber + ":");
        name = scanner.next();

        while (true) {
            System.out.println("- Введите скорость машины №" + carNumber + ":");
            speed = scanner.nextInt();

            if (speed > 0 && speed <= 250) {
                break;
            } else {
                System.out.println("Скорость автомобиля должна быть больше 0 км/ч и не превышать 250 км/ч.");
            }
        }

        return new Car(name, speed);
    }
}
