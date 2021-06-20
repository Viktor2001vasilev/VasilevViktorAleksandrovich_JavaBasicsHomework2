package food;

public class Meat extends Food {
    public Meat(String foodName, int satiety) {
        setFoodName(foodName);
        setSatiety(satiety);
    }
    public Meat() {
        setFoodName("Мясо");
    }
}
