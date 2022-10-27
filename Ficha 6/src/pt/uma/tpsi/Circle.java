package pt.uma.tpsi;

public class Circle extends Shape {
    //atributo
    private double radius;

    //constructor
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle() {
        super();
        radius = 0.0;
    }

    //getter and setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //extend
    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public Double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public Double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
