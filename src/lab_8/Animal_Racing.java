package lab_8;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Animal_Racing {

    public static void checkAnimalWinner(ArrayList<Animal> animalList){
        ArrayList<Animal> unFlyable = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.withWings()) {
                unFlyable.add(animal);
            }
        }
        ArrayList<Animal> racingAnimals = new ArrayList<>();
        if (unFlyable.size() > 0) {
            Animal winner = unFlyable.get(0);
            racingAnimals.add(winner);
            for (int i = 1; i< unFlyable.size(); i++) {
                if (winner != null && unFlyable.get(i).getSpeed() > winner.getSpeed()) {
                    winner = unFlyable.get(i);
                    racingAnimals.clear();
                    racingAnimals.add(winner);
                } else if (winner != null &&  unFlyable.get(i).getSpeed() == winner.getSpeed()){
                    winner = unFlyable.get(i);
                    racingAnimals.add(winner);
                }
            }
        }
        if (unFlyable.size() == 0) {
            System.out.println("All animals can fly, so we can not see which is the winner");
        } else if (racingAnimals.size() > 0){
            System.out.printf("There are %d winners:\n", racingAnimals.size());
            for (Animal animal : racingAnimals) {
                System.out.printf("The winner is %s with amazing speed at: %s km/h\n",
                        animal.getName(),
                        animal.getSpeed());
            }
        }

    }

    public static void main(String[] args) {
        Animal eagle = new Animal.Builder().withName("Eagle").withSpeed(new SecureRandom().nextInt(101))
                .withWings(true).build();
        Animal hummingbird = new Animal.Builder().withName("Hummingbird").withSpeed(new SecureRandom().nextInt(71))
                .withWings(true).build();
        Animal falcon = new Animal.Builder().withName("Falcon").withSpeed(new SecureRandom().nextInt(91))
                .withWings(true).build();
        Animal tiger = new Animal.Builder().withName("Tiger").withSpeed(new SecureRandom().nextInt(101))
                .withWings(false).build();
        Animal snake = new Animal.Builder().withName("Snake").withSpeed(new SecureRandom().nextInt(61))
                .withWings(false).build();
        Animal pikachu = new Animal.Builder().withName("Pikachu").withSpeed(new SecureRandom().nextInt(101))
                .withWings(false).build();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(eagle);
        animalList.add(hummingbird);
        animalList.add(falcon);
        animalList.add(tiger);
        animalList.add(snake);
        animalList.add(pikachu);
        checkAnimalWinner(animalList);
    }
}
