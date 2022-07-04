package lab_10;

import java.security.SecureRandom;

public class Eagle extends Animals {

    public Eagle() {
        flyable = new Flyable();
        setSpeed(new SecureRandom().nextInt(101));
    }

    @Override
    public String getName() {
        return Eagle.class.getSimpleName();
    }
}
