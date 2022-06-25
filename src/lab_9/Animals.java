package lab_9;

import java.security.SecureRandom;

public abstract class Animals {
    protected int speed;
    protected String name;

    public Animals(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public abstract String getName();

    public abstract int getSpeed();
}
