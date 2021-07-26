package Task4;

import java.util.Date;

public class Russian implements Strategy {
    public void output(String n){
        Date j = new Date();
        System.out.println("Приветствую\t" + n + "\n" + j);
    }
}