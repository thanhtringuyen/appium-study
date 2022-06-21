package lab_8;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal() {
    }

    public Animal(Builder animalBuilder){
        name = animalBuilder.name;
        speed = animalBuilder.speed;
        flyable = animalBuilder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean withWings() {
        return flyable;
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyable;

        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Builder withSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public Builder withWings(boolean flyable){
            this.flyable = flyable;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}