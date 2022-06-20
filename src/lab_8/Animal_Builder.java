package lab_8;

public class Animal_Builder {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal_Builder() {
    }

    public Animal_Builder(Builder animalBuilder){
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

        public Builder withAnimalType(String name){
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
        public Animal_Builder animalbuilder(){
            return new Animal_Builder(this);
        }
    }
}