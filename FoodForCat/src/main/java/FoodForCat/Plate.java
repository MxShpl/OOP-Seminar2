package FoodForCat;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {

            this.food = food;


    }
    public void addFoodOnPlate(int newFood){
        if (newFood>=1){
            setFood(this.food+newFood);
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
