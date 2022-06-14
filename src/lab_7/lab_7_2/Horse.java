package lab_7.lab_7_2;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse(){
        super.setAnimalType(Horse.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(76));
    }
}
