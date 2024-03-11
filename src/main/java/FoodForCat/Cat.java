package FoodForCat;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public int eat(int plate,int appetite) {
        if(plate<appetite){
            return plate;
        }
        else{
            this.appetite = 0;
            this.satiety = true;
            return plate-appetite;
        }


    }
}
