public class Car {
    final String name;
    final int speed;
    private static final int ONE_DAY = 24;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    int getDistance() {
        return speed * ONE_DAY;
    }
}