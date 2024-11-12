

public class Giraffe extends Mammal implements Prey {
    public Giraffe(String name, int age, int runningSpeed) {
        super(name, age, "Tall and majestic", runningSpeed);
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Speed: " + runningSpeed + ", " + specialFeature);
    }

    @Override
    public String getName() {
        return name;
    }
}


