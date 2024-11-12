public abstract class Bird extends Animal {
    protected int heightOfFly;

    public Bird(String name, int age, String specialFeature, int heightOfFly) {
        super(name, age, specialFeature);
        this.heightOfFly = heightOfFly;
    }
}