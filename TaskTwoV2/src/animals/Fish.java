package animals;

public class Fish extends Herbivore implements Swim{
    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }

    public Fish(int id, String name) {
        super.setId(id);
        super.setName(name);
    }
    public Fish() {}
}
