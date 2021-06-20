package animals;

import food.*;

public class Herbivore extends Animal{
    @Override
    public void eat(Food food){
        if (!(food instanceof Grass)) {
            System.out.println(getName() +" не будет есть "+ food.getFoodName() + "!");
        }
        else {
            System.out.println(getName() + " ест " + food.getFoodName() + ".");
            setAnimalSatiety((getAnimalSatiety()+food.getSatiety()));
            System.out.println(getName() + " сыт на " + getAnimalSatiety() + " единиц.");
        }
    }

}
