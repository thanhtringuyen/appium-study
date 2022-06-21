package lab_7.lab_7_2;

import java.util.ArrayList;

public class AnimalsRacing {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dragon = new Lion();
        Animal leopard = new Cheetah();
        ArrayList<Animal> animalsList = new ArrayList<Animal>();

        animalsList.add(horse);
        animalsList.add(tiger);
        animalsList.add(dog);
        animalsList.add(dragon);
        animalsList.add(leopard);
        AnimalsRacing(animalsList);
    }


    public static void AnimalsRacing(ArrayList<Animal> animalList) {
        Animal winner = animalList.get(0);
        ArrayList<Animal> winners = new ArrayList<>();
        winners.add(winner);

        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).speed() > winner.speed()) {
                winner = animalList.get(i);
                winners.clear();
                winners.add(winner);
            } else if (animalList.get(i).speed() == winner.speed()) {
                winner = animalList.get(i);
                winners.add(winner);
            }
        }
            if (winners.size() > 1)
                System.out.printf("there are %d winners:\n", winners.size());
            for (Animal animal : winners) {
                System.out.printf("The winner is <%s> with amazing speed at: <%s>\n", animal.getAnimalType(), animal.getSpeed() + " km/h");
            }
        }
    }
