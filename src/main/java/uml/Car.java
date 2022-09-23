package uml;

public class Car extends Vehicle{


    public Car(String name, int qty, double price, Engine engine, float speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle car) {
        System.out.println(totalBeforeTax(car) + calcTax(car));
    }
}
