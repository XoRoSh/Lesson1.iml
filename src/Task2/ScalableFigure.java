package Task2;

public class ScalableFigure extends Figure {
    protected double scale;
    public ScalableFigure(){
        super();
        this.scale = 1.0;
    }
    public ScalableFigure(double x, double y,double scale, int[] rgb){
        super( x,  y, rgb);
        setScale(scale);
        System.out.println("Created Scalable  object");
    }
    //setScale
    public void setScale(double scale){
        this.scale = scale;
    }
    //getScale
    public double getScale(){
        return this.scale;
    }

    public void scale(double scale){
        setX(getX() * scale);
        setY(getY()* scale);
    }
}
