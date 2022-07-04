package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animals {

    public Tiger() {
        flyable = new UnFlyable();
        setSpeed(new SecureRandom().nextInt(111));
    }

    @Override
    public String getName() {
        return Tiger.class.getSimpleName();
    }
}
