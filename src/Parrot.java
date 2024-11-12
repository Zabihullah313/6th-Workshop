public class Parrot extends Bird implements Prey {
    public Parrot(String name, int age, int heightOfFly) {
        super(name, age, "Talks a lot", heightOfFly);
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Height of Fly: " + heightOfFly + ", " + specialFeature);
    }

    @Override
    public String getName() {
        return name;
    }
}