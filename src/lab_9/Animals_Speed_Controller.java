package lab_9;

import java.util.ArrayList;
import java.util.List;
public class Animals_Speed_Controller {

    public static void main(String[] args) {
        List<Animals> racingAnimalsList = new ArrayList<>();
        Animals_Speed_Controller speedController = new Animals_Speed_Controller();
        Animals dog = new Dog();
        Animals horse = new Horse();
        Animals tiger = new Tiger();
        Animals pikachu = new Pikachu();
        racingAnimalsList.add(dog);
        racingAnimalsList.add(horse);
        racingAnimalsList.add(tiger);
        racingAnimalsList.add(pikachu);
        speedController.racingAnimals(racingAnimalsList);
    }
    private Animals racingAnimals(List<Animals> racingAnimalsList) {
        Animals winnerAnimals = racingAnimalsList.get(0);
        for (int i = 1; i < racingAnimalsList.size(); i++) {
            if (racingAnimalsList.get(i).getSpeed() > winnerAnimals.getSpeed()) {
                winnerAnimals = racingAnimalsList.get(i);
            }
        }
        System.out.println("The winner is " + winnerAnimals.getName() + ", with speed: " + winnerAnimals.getSpeed());
        return winnerAnimals;
    }
}
