package lab_9;

public class Horse extends Animals {
    private static int HORSE_MAX_SPEED = 110;

    public Horse() {
        super(HORSE_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return Horse.class.getSimpleName();
    }
}
