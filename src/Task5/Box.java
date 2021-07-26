package Task5;

import java.util.Random;
//TODO: переопределить конструкторы для  сборки дерева вручную

public class Box implements Node {
    static Random random = new Random();
    Node [] siblings;
    double weightb;
    public Box(double minb, double maxb, double mint, double maxt, int maxelements, double probbox){
        weightb = ((random.nextDouble()*(maxb-minb)+minb));
        siblings = new Node [random.nextInt(maxelements+1)];
        for (int i = 0; i < siblings.length; i++){
            if (random.nextDouble() <= probbox){
                siblings[i] = new Box(minb, maxb, mint, maxt, maxelements, probbox);


            }
            else {
                siblings[i]= new Thing(mint, maxt);


            }

        }

    }



    @Override
    public double  getWeight(){
        System.out.println(weightb);
        double sum = 0;
        for (int i =0; i < siblings.length; i++){
            sum += siblings[i].getWeight();

        }
        sum += weightb;

        return sum;
    }
}
