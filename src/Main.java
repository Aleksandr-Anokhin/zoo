import java.util.ArrayList;
import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);
    }
}