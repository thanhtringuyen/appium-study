package lab_9;

public class Tiger extends Animals {
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return Tiger.class.getSimpleName();
    }
}
