import animals.Animal;
import animals.*;

import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        //------------------------Объявляем объекты классов------------------------
        Duck duck = new Duck(1,"Duck");
        duck.setVoice("Кря");
        duck.setAnimalSatiety(30);
        Duck duck2 = new Duck(2,"Duck2");
        duck.setVoice("Кря");
        duck.setAnimalSatiety(30);

        Fish fish = new Fish(3,"Fish");
        fish.setAnimalSatiety(2);
        Fish fish2 = new Fish(4,"Fish2");
        fish.setAnimalSatiety(2);

        Cow cow = new Cow(5,"Cow");
        cow.setVoice("Мууу");
        cow.setAnimalSatiety(21);

        Lion lion = new Lion(6, "Lion");
        lion.setVoice("РРРРР");
        lion.setAnimalSatiety(45);

        Bear bear = new Bear(7,"Bear");
        bear.setVoice("Ррррр");
        bear.setAnimalSatiety(89);

        Anaconda anaconda = new Anaconda(8,"Anaconda");
        anaconda.setVoice("Шшшшшш");
        anaconda.setAnimalSatiety(23);


        Worker worker = new Worker();

        Grass grass = new Grass("Травянной корм", 10);

        Meat meat = new Meat();
        meat.setSatiety(20);
        //-------------------------------------------------------------------------

        //------------------------Вызов методов рабочего---------------------------
        worker.feed(duck, meat);
        worker.feed(bear, meat);
        worker.feed(anaconda, meat);
        worker.feed(cow, grass);

        worker.getVoice(cow);
        worker.getVoice(lion);
        worker.getVoice(anaconda);
        worker.getVoice(bear);
        worker.getVoice(duck);
        //worker.getVoice(fish);
        //-------------------------------------------------------------------------

        //---------------------------------Пруд------------------------------------
        Animal[] pond = new Animal[] {fish, fish2, duck, duck2};
        for (int count = 0; count < pond.length; count++) {
            pond[count].swim();
        }
        //-------------------------------------------------------------------------
    }
}
