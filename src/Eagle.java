

public class Eagle extends Bird implements Hunter {
    public Eagle(String name, int age, int heightOfFly) {
        super(name, age, "Sharp eyes and strong wings", heightOfFly);
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Height of Fly: " + heightOfFly + ", " + specialFeature);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }
}
