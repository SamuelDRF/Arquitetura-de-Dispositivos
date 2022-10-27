package pt.uma.tpsi;

class Point {
    //atributos de classe
    private double x;
    private double y;

    //construtores
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point otherPoint) {
        double distance = Math.sqrt(
                Math.pow(otherPoint.getX() - x, 2) + Math.pow(otherPoint.getY() - y, 2)
        );
        return distance;
    }
}