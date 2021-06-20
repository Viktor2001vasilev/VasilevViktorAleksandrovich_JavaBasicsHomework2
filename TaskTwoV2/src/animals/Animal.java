package animals;

import food.Food;

public abstract class Animal {
    private int id;
    private String name;
    private String voice;
    private int animalSatiety;

    public void setAnimalSatiety(int satiety) {
        this.animalSatiety = satiety;
    }
    public int getAnimalSatiety() {
        return animalSatiety;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public String getVoice() {
        return voice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public abstract void eat(Food food);
    public void swim(){}



}
