package lab_7.lab_7_2;

import java.util.ArrayList;

public class AnimalsRacing {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal lion = new Lion();
        Animal cheetah = new Cheetah();
        ArrayList<Animal> animalsList = new ArrayList<Animal>();

        animalsList.add(horse);
        animalsList.add(tiger);
        animalsList.add(dog);
        animalsList.add(lion);
        animalsList.add(cheetah);
        AnimalsRacing(animalsList);
    }

    public static void AnimalsRacing(ArrayList<Animal> animalList){
        Animal winner =  animalList.get(0);
        ArrayList<Animal> reWinner = new ArrayList<>();
        reWinner.add(winner);

        for (int i=1; i<animalList.size();i++) {
            if (animalList.get(i).speed() > winner.speed()) {
                winner = animalList.get(i);
                reWinner.clear();
                reWinner.add(winner);
            }
        }
        if (reWinner.size()>1)
            System.out.printf("there are %d winners:", reWinner.size());
        for (Animal i: reWinner){
            System.out.printf("The winner is <%s> with amazing speed at: <%s>\n" , i.getAnimalType(),  i.getSpeed() + " km/h");
        }

    }
}
