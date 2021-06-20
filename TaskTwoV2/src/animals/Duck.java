package animals;

public class Duck extends Herbivore implements Fly, Voice, Run, Swim {
    @Override
    public void fly() {
        System.out.println(getName() + " летит");
    }
    @Override
    public String voice() {
        return getVoice();
    }
    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }




    public Duck(int id, String name) {
        super.setId(id);
        super.setName(name);
    }
    public Duck() {}
}
