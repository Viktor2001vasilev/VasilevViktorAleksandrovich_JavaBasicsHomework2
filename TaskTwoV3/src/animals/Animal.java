package animals;

import food.*;

public abstract class Animal {
    private int id;
    private String name;
    private int satiety;
    private String voice;

    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public String getVoice(){
        return voice;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSatiety() {
        return satiety;
    }

    public void eat(Food food) {}

}
