import animals.*;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("Рабочий кормит " + animal.getName() + ".");
        animal.eat(food);
    }
   //----------------------------------Перегрузка для getVoice-----------------
    public void getVoice(Duck duck) {
        speakWithAnimal(duck);
    }
    public void getVoice(Cow cow) {
        speakWithAnimal(cow);
    }
    public void getVoice(Lion lion) {
        speakWithAnimal(lion);
    }
    public void getVoice(Bear bear) {
        speakWithAnimal(bear);
    }
    public void getVoice(Anaconda anaconda) {
        speakWithAnimal(anaconda);
    }
    //-------------------------------------------------------------------------


    public void speakWithAnimal(Animal animal) {
        System.out.println("Рабочий просит " + animal.getName() + " поговорить с ним.");
        System.out.print(animal.getName() + " говорит ");
        System.out.println(animal.getVoice());
    }
}
