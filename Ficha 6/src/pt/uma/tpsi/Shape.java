package pt.uma.tpsi;

public abstract class Shape {
    protected Point position;

    //constructor
    public Shape(double x, double y) {
        this.position = new Point(x,y);
    }
    public Shape() {
        position = new Point();
    }

    //getter and setter


    public void setPosition(Point position) {
        this.position = position;
    }
    public abstract Point getPosition();
    public abstract Double getArea();
    public abstract Double getPerimeter();
}

