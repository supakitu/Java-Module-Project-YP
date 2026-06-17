import java.util.Scanner;

public class Main {
    static Car firstCar;
    static Car secondCar;
    static Car thirdCar;
    static Car fastestCar;
    static int MIN_CAR_SPEED = 0;
    static int MAX_CAR_SPEED = 250;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
            "======================================================================\n" +
            "                          24 часа Ле-Мана                              \n" +
            "                               v1.0                                   \n" +
            "======================================================================\n"
        );

        Main.firstCar = createCar(1);
        Main.secondCar = createCar(2);
        Main.thirdCar = createCar(3);

        fastestCar = Race.getFastestCar();

        System.out.println("Самая быстрая машина: " + fastestCar.name + " || Пройденная дистанция: " + Race.getDistance(fastestCar.speed) + "км");
    }

    public static Car createCar(int carNumber) {
        String name;
        int speed;

        System.out.println("- Введите имя машины №" + carNumber + ":");
        name = sc.next();

        while (true) {
            System.out.println("- Введите скорость машины №" + carNumber + ":");

            // Проверяем что ввод это целое число (и оно в диапозоне 1 - 250), если нет цикл продолжает вертется [узнал про hasNextInt() в интернете]
            if (sc.hasNextInt()) {
                speed = sc.nextInt();

                if (speed > MIN_CAR_SPEED && speed <= MAX_CAR_SPEED) {
                    break;
                } else {
                    System.out.println("Скорость автомобиля должна быть больше 0 км/ч и не превышать 250 км/ч.");
                }
            } else {
                // после одной итерации цикла с неверным вводом, метод hasNextInt() почему то запоминал это значением и превращял метод в бесконечный
                // поэтому я взял у LLM эту строчку
                sc.next();
                System.out.println("Скорость автомобиля должна быть целым числом.");
            }
        }

        return new Car(name, speed);
    }
}