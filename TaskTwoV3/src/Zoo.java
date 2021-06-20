import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck(1,10,"Duck", "кря");
        Duck duck2 = new Duck(2,10,"Duck2", "кря");
        Cow cow = new Cow(3,20,"Cow", "муууу");
        Fish fish = new Fish(4, 2,"Fish", null);
        Fish fish2 = new Fish(5,2,"Fish2", null);
        Lion lion = new Lion(6, 30, "Lion", "PPPPPPP");
        Bear bear = new Bear(7, 40, "Bear", "Pppppp");
        Anaconda anaconda = new Anaconda(8, 10, "Anaconda", "Шшшшшш");

        Worker worker = new Worker();

        Banana banana = new Banana("Banana", 5);
        Stake stake = new Stake("Stake", 10);
        FishFood fishFood = new FishFood("FishFood", 1);

        worker.feed(duck,stake);
        worker.feed(duck,banana);
        worker.feed(fish, fishFood);
        worker.feed(fish,banana);
        worker.getVoice(duck);
        worker.getVoice(bear);
        //worker.getVoice(fish);

        Swim[] pound = new Swim[] {fish, fish2, duck, duck2};
        for (int count = 0; count < pound.length; count++) {
            pound[count].swim();
        }
    }
}
