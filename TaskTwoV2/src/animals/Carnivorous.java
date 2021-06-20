package animals;

import food.*;

public class Carnivorous extends Animal{
    @Override
    public void eat(Food food){
        if (!(food instanceof Meat)) {
            System.out.println(getName() +" не будет есть "+ food.getFoodName() + "!");
        }
        else {
            System.out.println(getName() + " ест " + food.getFoodName() + ".");
            setAnimalSatiety((getAnimalSatiety()+food.getSatiety()));
            System.out.println(getName() + " сыт на " + getAnimalSatiety() + " единиц.");
        }
    }

}
