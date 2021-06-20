package food;

public class Grass extends Food {
    public Grass(String foodName, int satiety) {
        setFoodName(foodName);
        setSatiety(satiety);
    }
    public Grass() {
        setFoodName("Трава");
    }
}
