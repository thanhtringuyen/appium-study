package lab_10;

import java.util.ArrayList;
import java.util.List;

public class Animal_Racing {

    public static void main(String[] args) {
        List<Animals> animalList = new ArrayList<>();
        Animal_Racing animalRacing = new Animal_Racing();
        Animals cat = new Cat();
        Animals eagle = new Eagle();
        Animals pikachu = new Pikachu();
        Animals tiger = new Tiger();
        animalList.add(cat);
        animalList.add(eagle);
        animalList.add(pikachu);
        animalList.add(tiger);
//        Animal_Racing.Animals(animalList);
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
