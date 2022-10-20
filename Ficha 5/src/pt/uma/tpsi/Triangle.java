package pt.uma.tpsi;

public class Triangle {
    //atribtos
    private Point a;
    private Point b;
    private Point c;

    //construtor predefinido
    public Triangle() {
    a = new Point();
    b = new Point();
    c =  new Point();
    }

    //construtor
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getter e Setter
    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public void setABC(Point a,Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double base(){
        return b.distanceTo(c);
    }
    public double altura(){
        return a.distanceTo(b);
    }
    public double area(){
        return (base()*altura())/2;
    }
}
