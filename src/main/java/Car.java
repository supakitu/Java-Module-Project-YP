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

            // Проверяем что ввод это целое число (и оно в диапозоне 1 - 250), если нет цикл продолжает вертется (узнал про hasNextInt() в интернете)
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();

                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Скорость автомобиля должна быть больше 0 км/ч и не превышать 250 км/ч.");
                }
            } else {
                scanner.next(); // после одной итерации цикла с неверным вводом метод hasNextInt() почему то запоминал это значением и превращял метод в бесконечный. поэтому я взял у LLM эту строчку
                System.out.println("Скорость автомобиля должна быть целым числом");
            }
        }

        return new Car(name, speed);
    }
}
