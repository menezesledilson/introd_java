package Exemplos;

public class sCops {
//    Demonstrar operadores de curto circuito
    public static void  main (String[] args){
        int n, d, q;
        n = 10;
        d =2;
        if(d != 0  && (n % d) == 0)
            System.out.println( d + " is a factor of " + n);
        d = 0; // configura d com zero

        //Já que d é igual a zero, o segundo operando não é valido.

        if(d != 0 && ( n % d ) == 0 ) //<----- o operador de curto circuito impede uma divisão zero.
            System.out.println( d + " is a factor of " + n);
//        Tente a mesma coisa sem operador de curto circuito. Isso ocerrar um erro de divisão por zero.

        if( d !=0 & (n % d) == 0) //<------ Agora as duas eoressi~eos são avaliadas, permitindo que ocorra uma dvisão por zero
            System.out.println( d + " is a factor of " + n);
    }
}
