package animals;

public class Cow extends Herbivore implements Run, Voice{
    @Override
    public String voice() {
        return getVoice();
    }
    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }


    public Cow(int id, String name) {
        super.setId(id);
        super.setName(name);
    }
    public Cow() {}
}
