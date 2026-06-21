public class Race {
    private static Car bestCar;

    public static void findBestCar(Car car) {
        if (bestCar != null && car.getDistance() > bestCar.getDistance()) {
            bestCar = car;
        } else {
            bestCar = Main.carsList.get(0);
        }
    }

    static String getBestCarName() {
        return bestCar.getName();
    }

    static int getBestCarDistance() {
        return bestCar.getDistance();
    }
}
