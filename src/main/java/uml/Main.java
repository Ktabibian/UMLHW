package uml;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(4);

        Car car = new Car("Benz", 3, 40, engine, 50f);
        Truck truck = new Truck("Avalanche", 1, 60, engine, 40f);
        Bike bike = new Bike("Ninja", 5, 20, 70f);
        Horse horse = new Horse("Biscuit", 1, 55, 20f);
        RollerCoaster rollerCoaster = new RollerCoaster(15, 40f);

        Vehicle[] vehicles = {car, truck, bike, horse};
        Rideable[] rideables = {horse, bike, rollerCoaster};

        for(Vehicle x : vehicles){
            x.totalAfterTax(vehicles[3]);
        }


        VehicleApp.printVehicleNamesAndPrices(vehicles);
        VehicleApp.printSpeedOfRideableObjects(rideables);

    }
}
