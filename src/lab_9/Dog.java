package lab_9;

public class Dog extends Animals {
    private static int DOG_MAX_SPEED = 60;

    public Dog() {
        super(DOG_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return Dog.class.getSimpleName();
    }
}
