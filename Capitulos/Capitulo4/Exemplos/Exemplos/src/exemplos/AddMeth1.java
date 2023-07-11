package exemplos;

public class AddMeth1 {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //atribui valores a campos de  minivan

        minivan.passengers = 7 ;
        minivan.fuelcap = 16;
        minivan.mpg = 21;


        //atribui valores a campos de  sportscar

        sportscar.passengers = 2 ;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        
        System.out.print("Minivan can carry " + minivan.passengers + ".");


        System.out.println("Range is " + minivan.fuelcap * minivan.mpg);

        System.out.print("Sportscar can carry " + sportscar.passengers + ".");

     System.out.println("Range is " + sportscar.fuelcap * sportscar.mpg);
    }
}
