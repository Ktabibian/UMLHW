package uml;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;
    private float speed;
    private Engine engine;
    private final double tax = 0.15;

    public Vehicle(String name, int qty, double price, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    public Vehicle(String name, int qty, double price, Engine engine, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getTax() {
        return tax;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return price * qty;
    }

    public double calcTax(Vehicle vehicle){
        return price * qty * tax;
    }

    public abstract void totalAfterTax(Vehicle vehicle);

}
