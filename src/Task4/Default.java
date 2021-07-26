package Task4;

import java.util.Date;

public class Default implements Strategy{
    public void output(String n){
        Date j = new Date();
        System.out.println(n + "\n" + j);

    }
}
