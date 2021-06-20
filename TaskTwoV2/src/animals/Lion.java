package animals;

public class Lion extends Carnivorous implements Run, Swim, Voice{
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



    public Lion(int id, String name) {
        super.setId(id);
        super.setName(name);
    }
    public Lion() {}
}