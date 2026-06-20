public class Race {
    static Car bestCar;

    public static void getBestCar(Car car) {
        if (car.getDistance() < bestCar.getDistance()) {
            bestCar = car;
        }
    }
}
