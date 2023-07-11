package exemplos;

public class Vehicle {

    int passengers; //números de passageiro
    int fuelcap; // capacidade de armazenamento de combustivel em galões
    int mpg; // consumo de combustível em mlhas por galão

    //Exibe a autonomia.

    // O método range() está contido dentro da classe Vehicle
    int range(){
        System.out.println("Ranger is " + fuelcap * mpg); //Observe que fuelcap e mpg são usados diretamente, sem o operador pronto.

        return 0;
    }
}
