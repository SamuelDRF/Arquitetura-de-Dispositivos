package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(3.0,3.0);
        Point b = new Point();
        Point c = new Point(6.0,2.0);
        Point d = new Point(3.0,3.0);

        System.out.println("Point___________________________________________________");
        System.out.println("Get cordenada x de a: "+(a.getX()));
        a.setXY(5.0,3.0);
        System.out.println("Get cordenada x de a: "+(a.getX()));
        System.out.println("distancia de a hasta b: "+a.distanceTo(b));

        System.out.println("Triangle___________________________________________________");
        Triangle tri = new Triangle(a,b,c);
        System.out.println("Get punto c del triangulo (imprime la posicion de memoria): "+(tri.getC()));
        System.out.println("Base: "+tri.base());
        System.out.println("Altura: "+tri.altura());
        System.out.println("Area: "+tri.area());
        System.out.println("Rectangle___________________________________________________");
        Rectangle rec = new Rectangle(a,4.0,3.0);
        System.out.println("Area: "+rec.arearectanble());
        System.out.println("Area: "+rec.perimetro());
        System.out.println(rec.pointIn(d));
    }
}