import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cheetah cheetah = new Cheetah("Cheetah", 12, 120);
        Parrot parrot = new Parrot("Parrot", 3, 50);
        Giraffe giraffe = new Giraffe("Giraffe", 8, 25);
        Eagle eagle = new Eagle("Eagle", 5, 200);


        List<Animal> zooAnimals = new ArrayList<>();
        zooAnimals.add(cheetah);
        zooAnimals.add(parrot);
        zooAnimals.add(giraffe);
        zooAnimals.add(eagle);

        // Displaying animal details
        for (Animal animal : zooAnimals) {
            animal.show();
        }

        //Hunting behavior
        cheetah.hunt(parrot);
        eagle.hunt(giraffe);


    }
}