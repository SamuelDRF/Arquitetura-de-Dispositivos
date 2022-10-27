package pt.uma.tpsi;

public class Rectangle extends Shape{
    //atributos
    private Point topLeftPoint;
    private double height;
    private double width;

    //construtor predefinido
    public Rectangle() {
        topLeftPoint = new Point();
        height = 0.0;
        width = 0.0;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public Double getPerimeter() {
        return ((width*2)+(height*2));
    }

    //construtor
    public Rectangle(Point topLeftPoint,Double height,Double width) {
        this.topLeftPoint=topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double arearectanble(){
        return (width*height);
    }
    public double perimetro(){
        return 2*(width+height);
    }

    //aqui va el pointin
    public boolean pointIn(Point point){
        if(topLeftPoint.getY() <= point.getY() && point.getY() >= topLeftPoint.getY() - height && topLeftPoint.getX() >= point.getX() && topLeftPoint.getX() + width >= point.getX()){
            return true;
        }
        return false;
    }
}
