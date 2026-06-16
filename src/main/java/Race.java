public class Race {
    private static final int ONE_DAY = 24;

    public static Car getFastestCar() {
        if (getDistance(Main.firstCar.speed) > getDistance(Main.secondCar.speed) && getDistance(Main.firstCar.speed) > getDistance(Main.thirdCar.speed)) {
            return Main.firstCar;
        } else if (getDistance(Main.secondCar.speed) > getDistance(Main.firstCar.speed) && getDistance(Main.secondCar.speed) > getDistance(Main.thirdCar.speed)) {
            return Main.secondCar;
        } else if (getDistance(Main.thirdCar.speed) > getDistance(Main.firstCar.speed) && getDistance(Main.thirdCar.speed) > getDistance(Main.secondCar.speed)) {
            return Main.thirdCar;
        }

        return null;
    }

    static int getDistance(int speed) {
        return speed * ONE_DAY;
    }
}
