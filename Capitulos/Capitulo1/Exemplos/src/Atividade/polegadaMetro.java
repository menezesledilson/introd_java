package Atividade;

public class polegadaMetro {

    public static void main(String[]args){
        double polegada, metro ;
        int counter;

        counter = 0 ;
//          (inicialização + condição + iteração) instrução
        for( polegada = 1; polegada <=48; polegada++){
            metro = polegada * 39.37;

            System.out.println(polegada + " polegada é igual a : " + metro + " m.");

            counter++;

            if(counter == 12 ){
                System.out.println();
                counter = 0;
            }

        }

    }
}
