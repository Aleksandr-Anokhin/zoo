package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeTerrarium;
    }


    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeTerrarium() {
        return snakeCage;
    }

    public void setSnakeTerrarium(AnimalCage<Snake> snakeTerrarium) {
        this.snakeCage = snakeTerrarium;
    }

    public void takeOfLion() {
        this.lionCage.takeOffAnimal();
    }

    public int addLion(Lion animal) {
        if (this.lionCage == null) {
            return 0;
        } else {
            return this.lionCage.addAnimal(animal);
        }
    }
}
