package exemplos;

public class ContDemo {
    //Usar continue
    public static void main (String[] args){

        int i ;

        //exibe o numeros pares entre 0 a 100;

        for ( i = 0; i <= 100; i ++){
            if ( (i % 2) !=0) continue; //iterate
            System.out.println(("Os numeros pares de 2: " + i));
        }
    }
}
