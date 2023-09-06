class Vehicle {
    private int passengers; // number of passengers
    private int fuelcap; // fuel capacity in gallons
    private int mpg; // fuel consumption in miles per gallon

    // Constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Calculate the fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instance variables
    int getPassengers() {
        return passengers;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // Constructor for Truck
    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    // Accessor method for cargocap
    int getCargocap() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

public class TruckDemo {
    public static void main(String[] args) {
        // Construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel\n");
    }
}
