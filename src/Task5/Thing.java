package Task5;
import java.util.*;

public class Thing implements Node {
    Random randomt = new Random();
    double weight;
    public Thing(double mint, double maxt){
        weight = (randomt.nextDouble()*(maxt-mint))+mint;
    }



    @Override
    public double getWeight(){
        System.out.println("weight"  + weight);
        return this.weight;
    }
}
