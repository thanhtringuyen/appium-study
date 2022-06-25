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
        Animals winnerAnimal = racingAnimalsList.get(0);
        ArrayList<Animals> winners = new ArrayList<>();
        winners.add(winnerAnimal);

        for (int i = 1; i < racingAnimalsList.size(); i++) {
            if (racingAnimalsList.get(i).getSpeed() > winnerAnimal.getSpeed()) {
                winnerAnimal = racingAnimalsList.get(i);
                winners.clear();
                winners.add(winnerAnimal);
            } else if (racingAnimalsList.get(i).getSpeed() == winnerAnimal.getSpeed()) {
                winnerAnimal = racingAnimalsList.get(i);
                winners.add(winnerAnimal);
            }
        }
        if (winners.size() > 1)
            System.out.printf("There are %d winners:\n", winners.size());
        for (Animals animal : winners) {
            System.out.printf("The winner is <%s> with amazing speed at: <%s>\n", animal.getName(), animal.getSpeed() + " km/h");
        }
        return winnerAnimal;
    }
}