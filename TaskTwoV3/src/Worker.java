import animals.*;
import food.*;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("Рабочий пытается накормить " + animal.getName() + " и дает ему " + food.getFoodName() + ".");
        animal.eat(food);
    }
    public void getVoice(Voice animal) {
        System.out.println("Рабочий пытается поговорить с " + animal.name() + ".");
        System.out.println(animal.name() + " говорит " + animal.voice() + ".");
    }
}
