package Task4;

import java.util.Date;

public class English implements Strategy {
    public void output(String n){
        Date j = new Date();
        System.out.println("Hello\t" + n + "\n" + j);

    }
}
