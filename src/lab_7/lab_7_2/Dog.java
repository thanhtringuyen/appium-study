package lab_7.lab_7_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(){
        super.setAnimalType(Dog.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(61));
    }
}