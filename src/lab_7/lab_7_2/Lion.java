package lab_7.lab_7_2;

import java.security.SecureRandom;

public class Lion extends Animal{
    public Lion(){
        super.setAnimalType(Lion.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(81));
    }
}
