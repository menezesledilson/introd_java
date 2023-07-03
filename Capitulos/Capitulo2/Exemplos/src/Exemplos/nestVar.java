package Exemplos;
/*Este programa tenta declarar uma variavel em um escopo interno com o mesmo nome de
* uma definida em um escopo externo.
*
* Esse programa não será declarado*/
public class nestVar {
    public static void main (String[] args){
        int count; //<----- Não pode declara count novamente proque elea já foi declada.

        for (count = 0; count < 100; count = count +1){
            System.out.println("this is count: " + count);

           //int count; // inválido!!! <----- Não pode declara count novamente proque elea já foi declada.
            for( count = 0 ; count < 2; count++)
                System.out.println("This program is in error! ");
        }
    }
}
