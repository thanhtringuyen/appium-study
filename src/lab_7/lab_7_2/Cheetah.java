package lab_7.lab_7_2;

import java.security.SecureRandom;

public class Cheetah extends Animal{

    public Cheetah(){
        super.setAnimalType(Cheetah.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(121));
    }
}
