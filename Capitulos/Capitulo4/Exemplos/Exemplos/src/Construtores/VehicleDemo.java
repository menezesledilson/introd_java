package Construtores;

import exemplos.Vehicle3;

public class VehicleDemo {
    private int passengers; // número de passageiros
    private int fuelcap;    // capacidade de armazenamento de combustível
    private int mpg;        // consumo de combustível em milhas por galão

    // Esse é um construtor para Vehicle
    VehicleDemo(int p, int f, int m) {  //<----------- Construtor de Vehicle
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Retorna a autonomia
    int range() {
        return mpg * fuelcap;
    }

    // Calcula o combustível necessário para cobrir uma determinada distância
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    public static void main(String args[]) {
        // constrói veículos completos
        VehicleDemo minivan = new VehicleDemo(7, 16, 21);
        VehicleDemo sportscar = new VehicleDemo(7, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles, sportscar needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles, sportscar needs " + gallons + " gallons of fuel.");
    }
}
