package pt.uma.tpsi;

public class Car extends Vehicle{
    private int Doors;
    //contructor

    public Car(int doors) {
        Doors = doors;
    }

    public Car(int year, String brand, String model, double price, String color, int doors) {
        super(year, brand, model, price, color);
        Doors = doors;
    }
    //getter and setter

    public int getDoors() {
        return Doors;
    }

    public void setDoors(int doors) {
        Doors = doors;
    }

    //extend Vehicle
    @Override
    public String toString() {
        return "Car {"+
                "year="+getYear()+
                ", brand="+getBrand()+
                ", model="+getModel()+
                ", price="+getPrice()+
                ", color="+getColor()+
                ", doors="+getDoors()+
                "}";
    }
}
