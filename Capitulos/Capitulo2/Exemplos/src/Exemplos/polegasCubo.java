package Exemplos;

public class polegasCubo {

    public static void main (String[] args){
        long cubico;
        long polegada;

        polegada = 5280 * 12;

        cubico = polegada * polegada * polegada ;

        System.out.println("O volume em polegadas cúbicas é: " + cubico);
    }
}
