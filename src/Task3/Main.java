package Task3;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Rational a = new Rational(3, 5);
        Rational b = new Rational(3, 2);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        Rational add;
        Rational sub;
        Rational mul;
        Rational div;

        add = (Rational) a.add(b);
        sub = (Rational) a.substract(b);
        mul = (Rational) a.multiply(b);
        div = (Rational) a.divide(b);


        System.out.println("Addition"+add);
        System.out.println("Substraction"+sub);
        System.out.println("Multiplication"+mul);
        System.out.println("Division" + div);
        Date j = new Date();
        System.out.println(j);



    }
}


