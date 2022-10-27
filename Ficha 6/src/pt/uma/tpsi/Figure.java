package pt.uma.tpsi;

import java.util.ArrayList;

public class Figure {
    private ArrayList<Shape> shapes;

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public Figure() {
        shapes = new ArrayList<Shape>();
    }


    //getter and setter

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void  add(Shape shape){
        shapes.add(shape);
    }
    public String toString() {
        return String.valueOf(shapes);
    }
}
