package exemplos;

public class Vehicle1 {
    public static void main(String[] args) {

        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        // Assign values to fields of minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields of sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Get the ranges

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1 + " Miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " Miles");
    }
}
