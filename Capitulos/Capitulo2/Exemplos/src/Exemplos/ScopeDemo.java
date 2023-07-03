package Exemplos;

public class ScopeDemo {

    // demoonstra o escopo do bloco

    public static void  main (String[] args){
        int x; // conhecida pelo código dentro do  main()
        x= 10;
        if (x==10)  { //<-- Inicia o escopo

            int y = 20; // conehcida apenas nesse bloco

            //tanto x quando y são conhecidas aqui.

            System.out.println("x and y: " + x + " " + y);
            x = y * 2 ;
        }
        // y =100 // Erro! Y não é conhecida aqui <-----Aqui y está fora do seu escopo

        // x ainda é conhecida aqui.
        System.out.println("x is " + x);
    }
}
