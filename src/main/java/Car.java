public class Car {
    private final String name;
    private final int speed;
    private static final int ONE_DAY = 24;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    int getDistance() {
        return speed * ONE_DAY;
    }
}