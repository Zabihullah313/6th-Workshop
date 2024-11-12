

public class Cheetah extends Mammal implements Hunter {
    public Cheetah(String name, int age, int runningSpeed) {
        super(name, age, "The fastest", runningSpeed);
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Speed: " + runningSpeed + ", " + specialFeature);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }
}