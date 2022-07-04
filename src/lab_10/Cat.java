package lab_10;

import java.security.SecureRandom;

public class Cat extends Animals {

    public Cat() {
        flyable = new UnFlyable();
        setSpeed(new SecureRandom().nextInt(61));
    }

    @Override
    public String getName() {
        return Cat.class.getSimpleName();
    }
}
