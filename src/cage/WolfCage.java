package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;

public class WolfCage implements AnimalCage{
    /* Вот такая ошибка:
Class 'WolfCage' must either be declared abstract or implement abstract method 'giveFood(int)' in 'AnimalCage'
     */
    private ArrayList<Wolf> wolves;
    private int foodWeight;
    private int garbageWeight;

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = this.wolves;
    }

    public void setWolves(ArrayList<Wolf> wolves) {

        this.wolves = wolves;
    }

    public int getFoodWeight() {

        return foodWeight;
    }

    public void setFoodWeight(int foodWeight) {

        this.foodWeight = foodWeight;
    }

    public int getGarbageWeight() {

        return garbageWeight;
    }

    public void setGarbageWeight(int garbageWeight) {

        this.garbageWeight = garbageWeight;
    }

    @Override
    public int addAnimal(Animal animal) {
        wolves.add((Wolf) animal);
        return wolves.size();
    }

    @Override
    public int deliverFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        try {
            for (Animal wolf : wolves) {
                wolf.feed(tmpFood);
                if (tmpFood > wolf.getMaxWeight()) {
                    tmpFood -= wolf.getMaxWeight();
                } else {
                    tmpFood = 0;
                }
            }
            this.foodWeight = tmpFood;
        }
        catch (Exception e){
            this.foodWeight = 0;
            this.garbageWeight = tmpFood;
        }

    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        }
        else {
            this.garbageWeight = 0;
        }
    }

    public Wolf takeOffAnimal(){
            return null;

    }

    @Override
    public String toString() {
        return "LionCage{" +
                "foodWeight=" + foodWeight +
                ", garbageWeight=" + garbageWeight +
                ", wolves=" + wolves +
                '}';
    }

}
