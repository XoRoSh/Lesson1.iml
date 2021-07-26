package Task3;

public class Rational implements Num {
    int numerator = 0;
    int denominator = 1;
    public Rational(){

    }
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        setDenominator(denominator);
    }
    public void setDenominator(int denominator){
        if(denominator != 0){
            this.denominator = denominator;
        }
        else{
            throw new RuntimeException("used 0 in denominator");
        }
    }

    @Override
    public Num add(Num n) {
        Rational second;
        Rational res = new Rational();
        second = (Rational) n;
        res.numerator = (second.numerator * this.denominator) + (this.numerator * second.denominator);
        res.denominator = this.denominator * second.denominator;
        return res;
    }

    @Override
    public String toString() {
        return String.format(" %f", ((double) this.numerator) / this.denominator);
    }

    @Override
    public Num substract(Num n){
        Rational second;
        Rational res = new Rational();
        second = (Rational) n;
        res.numerator = (this.numerator * second.denominator) - (second.numerator * this.denominator);
        res.denominator = this.denominator * second.denominator;
        return res;
    }

    @Override
    public Num multiply(Num n){
        Rational second;
        Rational res = new Rational();
        second = (Rational) n;
        res.numerator = (this.numerator * second.numerator);
        res.denominator = (this.denominator * second.denominator);
        return res;
    }

    @Override
    public Num divide(Num n){
        Rational second;
        Rational res = new Rational();
        second = (Rational) n;
        res.numerator = (this.numerator * second.denominator);
        res.denominator = (this.denominator * second.numerator);
        return res;
    }

}
