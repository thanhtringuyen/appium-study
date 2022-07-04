package lab_10;

import java.security.SecureRandom;

public class Pikachu extends Animals {

    public Pikachu() {
        flyable = new UnFlyable();
        setSpeed(new SecureRandom().nextInt(121));
    }

    @Override
    public String getName() {
        return Pikachu.class.getSimpleName();
    }
}
