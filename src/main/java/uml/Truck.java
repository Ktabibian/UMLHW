package uml;

public class Truck extends Vehicle{


    public Truck(String name, int qty, double price, Engine engine, float speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle truck) {
        System.out.println(totalBeforeTax(truck) + calcTax(truck));
    }
}
