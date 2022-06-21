package lab_8;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Animal_Racing {

    public static void checkAnimalWinner(ArrayList<AnimalBuilder> animalList){
        AnimalBuilder winner = new AnimalBuilder.Builder().withAnimalType("winner").withSpeed(0).withWings(false).animalbuilder();
        ArrayList<AnimalBuilder> racingAnimals = new ArrayList<>();
        racingAnimals.add(winner);
        for (int i=1; i<animalList.size(); i++) {
            if (animalList.get(i).withWings())
                continue;
            if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                winner = animalList.get(i);
                racingAnimals.clear();
                racingAnimals.add(winner);
            }
        }
        if(racingAnimals.size()==1){
            if(racingAnimals.get(0).getName().equals("winner"))
                System.out.println("All animals can fly, so we can not see which is the winner");
            else
                System.out.println("The winner is %s with amazing speed at: %s km/h", racingAnimals.get(0).getName(), racingAnimals.get(0).getSpeed());
            return;
        }
    }

    public static void main(String[] args) {
        AnimalBuilder eagle = new AnimalBuilder.Builder().withAnimalType("Eagle").withSpeed(new SecureRandom().nextInt(101))
                .withWings(true).animalbuilder();
        AnimalBuilder hummingbird = new AnimalBuilder.Builder().withAnimalType("Hummingbird").withSpeed(new SecureRandom().nextInt(71))
                .withWings(true).animalbuilder();
        AnimalBuilder falcon = new AnimalBuilder.Builder().withAnimalType("Falcon").withSpeed(new SecureRandom().nextInt(91))
                .withWings(true).animalbuilder();
        AnimalBuilder tiger = new AnimalBuilder.Builder().withAnimalType("Tiger").withSpeed(new SecureRandom().nextInt(81))
                .withWings(false).animalbuilder();
        AnimalBuilder snake = new AnimalBuilder.Builder().withAnimalType("Snake").withSpeed(new SecureRandom().nextInt(31))
                .withWings(false).animalbuilder();
        AnimalBuilder pikachu = new AnimalBuilder.Builder().withAnimalType("Pikachu").withSpeed(new SecureRandom().nextInt(101))
                .withWings(false).animalbuilder();

        ArrayList<AnimalBuilder> animalList = new ArrayList<>();
        animalList.add(eagle);
        animalList.add(hummingbird);
        animalList.add(falcon);
        animalList.add(tiger);
        animalList.add(snake);
        animalList.add(pikachu);
        checkAnimalWinner(animalList);
    }
}
