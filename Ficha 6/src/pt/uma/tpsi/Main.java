package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car audi = new Car(2010,"audi","a1",1000.0,"blue",3);
        Motorcycle Kawasiki = new Motorcycle(2017,"Kawasiki","Ninja",5000.0,"Black");
        System.out.println(audi.toString());
        System.out.println(Kawasiki.toString());

        Circle circle = new Circle(0,0,3);
        Rectangle rectangle = new Rectangle(new Point(0,3),10.0,20.0);
        Triangle triangle = new Triangle(new Point(4,0),new Point(0,2),new Point(0,0));
        Figure figure= new Figure();
        figure.add(triangle);
        figure.add(rectangle);
        figure.add(circle);
        System.out.println(figure);

    }
}