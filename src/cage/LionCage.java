package cage;

import animals.Animal;
import animals.Lion;

import java.util.ArrayList;


public class LionCage implements AnimalCage{
    private int foodWeight;
    private int garbageWeight;
    private ArrayList<Animal> lions;

    public LionCage(ArrayList<Lion> lions) {

        this.lions = this.lions;
    }

    public void setLions(ArrayList lions) {

        this.lions = lions;
    }

    public void setFoodWeight(int foodWeight) {

        this.foodWeight = foodWeight;
    }
    public void setGarbageWeight(int garbageWeight) {

        this.garbageWeight = garbageWeight;
    }

    public int getFoodWeight() {

        return foodWeight;
    }

    public int getGarbageWeight() {

        return garbageWeight;
    }

    public ArrayList<Animal> getLions() {

        return lions;
    }

    @Override
    public int addAnimal(Animal animal) {
        lions.add(animal);
        return lions.size();
    }

    @Override
    public void giveFood(int foodWeight) {

    }

    @Override
    public int deliverFood(int foodWeight) {

        return foodWeight;
    }
    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        } else {
            this.garbageWeight = 0;
        }
    }

    @Override
    public Animal takeOffAnimal() {
        return null;
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "foodWeight=" + foodWeight +
                ", garbageWeight=" + garbageWeight +
                ", lions=" + lions +
                '}';
    }
}
