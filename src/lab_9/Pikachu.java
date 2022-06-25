package lab_9;

public class Pikachu extends Animals {
    private static int PIKACHU_MAX_SPEED = 120;

    public Pikachu() {
        super(PIKACHU_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return Pikachu.class.getSimpleName();
    }
}
