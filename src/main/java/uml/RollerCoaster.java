package uml;

public class RollerCoaster implements Rideable{
    private double price;
    private float speed;
    private final double tax = 0.20;

    public RollerCoaster(double price, float speed) {
        this.price = price;
        this.speed = speed;
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

    public double getTax() {
        return tax;
    }

    public double rollerCoasterBeforeTax(){
        return price;
    }

    public double calcRollerCoasterTax(){
        return price * tax;
    }

    public void rollerCoasterAfterTax(){
        System.out.println(rollerCoasterBeforeTax() + calcRollerCoasterTax());
    }

    @Override
    public int milesPerHour() {
        return (int) this.speed;
    }
}
