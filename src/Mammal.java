public abstract class Mammal extends Animal {
    protected int runningSpeed;

    public Mammal(String name, int age, String specialFeature, int runningSpeed) {
        super(name, age, specialFeature);
        this.runningSpeed = runningSpeed;
    }
}