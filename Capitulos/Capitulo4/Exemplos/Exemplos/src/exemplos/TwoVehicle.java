package exemplos;

public class TwoVehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

    //Este programa cria dois objetos Vehicle

    public static void main(String args[]) {


        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //atribui valores a campos de minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;


        //atribui valores a campos de sportscar

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        //Calcula a autonomia presumindo um tanque cheio de fasolina
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry: " + minivan.passengers + " With a ranger of: " + range1);

        System.out.println("Sportcar can carry : " + sportscar.passengers + " With a ranger of: " + range2);

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();

        car1.mpg = 26;

        car2 = car3 ; //Agora car2 e car3 referenciam o mesmo objeto.

        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
    }
}
