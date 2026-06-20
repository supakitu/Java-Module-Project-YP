import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Car> carsList = new ArrayList<>();
    static final int MIN_CAR_SPEED = 0;
    static final int MAX_CAR_SPEED = 250;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ======================================================================
                                          24 часа Ле-Мана
                                               v1.0
                ======================================================================
                """);

        for (int i = 1; i <= 3; i++) {
            carsList.add(createCar(i));
        }

        System.out.println("Самая быстрая машина: " + Race.bestCar.getSpeed() + " || Пройденная дистанция: " + Race.bestCar.getDistance() + "км");
    }

    public static Car createCar(int carNumber) {
        String name;
        int speed;

        System.out.println("- Введите имя машины №" + carNumber + ":");
        name = sc.next();

        while (true) {
            System.out.println("- Введите скорость машины №" + carNumber + ":");

            // Проверяем что ввод это целое число (и оно в диапазоне 1 - 250), если нет цикл продолжает вертеться [узнал про hasNextInt() в интернете]
            if (sc.hasNextInt()) {
                speed = sc.nextInt();

                if (speed > MIN_CAR_SPEED && speed <= MAX_CAR_SPEED) {
                    break;
                } else {
                    System.out.println("Скорость автомобиля должна быть больше 0 км/ч и не превышать 250 км/ч.");
                }
            } else {
                // после одной итерации цикла с неверным вводом, метод hasNextInt() почему то запоминал это значением и превращал метод в бесконечный
                // поэтому я взял у LLM эту строчку
                sc.next();
                System.out.println("Скорость автомобиля должна быть целым числом.");
            }
        }

        Race.getBestCar(new Car(name, speed));

        return new Car(name, speed);
    }
}