package Task2;

public class Figure {
    protected double x;
    protected double y;
    protected int[] rgb;
    public Figure(){
        this.x = 0;
        this.y = 0;
        rgb = new int[3];
    }
    public Figure(double x, double y, int[] rgb){
        this();
        setX(x);
        setY(y);
        setRgb(rgb);
        System.out.println("created figure object");
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }

    public void setRgb(int [] rgb){
        for (int i = 0; i < rgb.length; i++){
            if (rgb[i] <= 255 && rgb[i] >= 0){
                this.rgb[i] = rgb[i];
            }
            else{
                throw new RuntimeException("incorrect number");
            }
        }
    }

    public int[] getRgb(){
        return this.rgb;
    }
}
