package exemplos;

public class VehicleDemo {
    private int passengers;
    private int fuelcap;
    private int mpg;

    //Essa declara um obejto de tipo Vehicle
    public static void main(String args[]) {

        VehicleDemo minivan = new VehicleDemo();//cria objeto Vehicke chamado minivan
        int range;

        //atribui valores a campos de minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Calcula a autonomia presumindo um tanque cheio de fasolina

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry: " + minivan.passengers + " With a ranger of: " + range);
    }
}