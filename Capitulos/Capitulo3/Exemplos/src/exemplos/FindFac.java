package exemplos;

public class FindFac {
    //Usa laços aninhados para encontrar os fatores dos númerors de 2 a 100

    public static void main (String [] args){
        for ( int i = 2;  i<=20; i++){
            System.out.println("Factors of "+ i + ": ");
            for ( int j =2; j < i; j++)
                if((i % j) == 0) System.out.println(j  + " ");
            System.out.println();
        }
    }
}
