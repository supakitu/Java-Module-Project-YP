public class Main {
    static Car firstCar;
    static Car secondCar;
    static Car thirdCar;
    static Car fastestCar;

    public static void main(String[] args) {
        System.out.println(
            "======================================================================\n" +
            "                          24 часа Ле-Мана                              \n" +
            "                               v1.0                                   \n" +
            "======================================================================\n"
        );

        Main.firstCar = Car.createCar(1);
        Main.secondCar = Car.createCar(2);
        Main.thirdCar = Car.createCar(3);

        fastestCar = Race.getFastestCar();

        System.out.println("Самая быстрая машина: " + fastestCar.name + " || Пройденная дистанция: " + Race.getDistance(fastestCar.speed) + "км");
    }
}