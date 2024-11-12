
public abstract class Animal {
    protected String name;
    protected int age;
    protected String specialFeature;

    public Animal(String name, int age, String specialFeature) {
        this.name = name;
        this.age = age;
        this.specialFeature = specialFeature;
    }

    public abstract void show();
}