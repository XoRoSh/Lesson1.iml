package Task1;


import javax.sound.midi.Soundbank;

public class Furniture {
    public static String currentSeason;
    private static int currentYear;
    public double basePrice;
    private int yearMade;
    static{
        System.out.println("Initialisation block was launched");
        currentSeason = "Summer";
        currentYear = 2021;
        System.out.println("public static String currentSeason");
        System.out.println("Current season is the same for all elements in this class");
        System.out.println("private static int currentYear");
        System.out.println("Current Year is the same for all elements in this class");
    }
    public Furniture(){
        System.out.println("Constructor 1 was launched");
        setBasePrice(2345.3);
        setYearMade(Furniture.currentYear);

//        this.yearMade = Furniture.currentYear;


    }
    public Furniture(double basePrice, int yearMade){
        System.out.println("Constructor 2 was launched");
        setBasePrice(basePrice);
        setYearMade(yearMade);
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public double getBasePrice(){
        return this.basePrice;
    }
    public void setYearMade(int yearMade){
        if (yearMade <= Furniture.currentYear) {
            this.yearMade = yearMade;
        }
        else{
            throw new RuntimeException("incorrect Year");
        }
    }
    public int getYearMade(){
        return this.yearMade;
    }

    private static int  estimateAge(Furniture f){
        return Furniture.currentYear - f.getYearMade();
    }
    public static double  estimatePrice(Furniture f){
        return f.getBasePrice() * Math.pow(0.95,  Furniture.estimateAge(f));
    }
    private int estimateAge(){
        return Furniture.estimateAge(this);
    }
    public double estimatePrice(){
        return Furniture.estimatePrice(this);
    }
}
