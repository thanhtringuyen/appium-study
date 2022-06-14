package lab_7.lab_7_2;

public class Animal {
    private String animalType;
    private int speed;

    public Animal() {
    }

    public Animal(String animalType, int speed) {
        this.animalType = animalType;
        this.speed = speed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed(){
        return getSpeed();
    }
}