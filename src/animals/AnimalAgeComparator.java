package animals;

import animals.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getBirthYear() < o2.getBirthYear()){
            return 1;
        }
        else if(o1.getBirthYear() > o2.getBirthYear()){
            return -1;
        }
        return 0;
    }
}
