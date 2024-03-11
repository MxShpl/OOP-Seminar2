package FoodForCat;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Pushok", 8, false);
        Cat cat3 = new Cat("Persik", 7, false);
        Cat cat4 = new Cat("Ryjik", 5, false);
        Cat cat5 = new Cat("Seryi", 2, false);

        Plate plate = new Plate(15);

        ArrayList<Cat> CatList = new ArrayList<>();
        CatList.add(cat);
        CatList.add(cat2);
        CatList.add(cat3);
        CatList.add(cat4);
        CatList.add(cat5);

        plate.info();

        for (Cat c:CatList){

            plate.setFood(c.eat(plate.getFood(), c.getAppetite()));

            if(c.getSatiety()){
                System.out.println(c.getName()+" покушал и теперь сыт "+c.getSatiety());

            }
            else{
                System.out.println(c.getName()+" мало еды. Кот голоден "+c.getSatiety());
                plate.addFoodOnPlate(5);
            }
            plate.info();

        }


    }
}