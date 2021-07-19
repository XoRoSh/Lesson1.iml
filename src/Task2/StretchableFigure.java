package Task2;

public class StretchableFigure extends ScalableFigure{
    protected double scaleX;
    protected double scaleY;
    public StretchableFigure(){
        super();
        this.scaleY = 1;
        this.scaleX = 1;
    }
    public StretchableFigure(double x, double y, double scale, double scaleX, double scaleY, int[] rgb){
        super( x,  y, scale, rgb);
        stretchX(scaleX);
        stretchY(scaleY);
        System.out.println("Created Stretchable object");
    }
    public void stretchX(double scaleX){
        this.scaleX = scaleX;
        setX(getScale()*scaleX);
    }
    public void stretchY(double scaleY){
        this.scaleY = scaleY;
        setY(getScale()*scaleY);
    }
}
