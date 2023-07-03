package Exemplos;

public class CharArithDemo {

    public static void  main (String[] args){

        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);

        ch++; // incrementa ch <---- um cchar pode ser incrementado.
        System.out.println("ch is now  " + ch);
        ch = 90; // dá a ch o vao z <-------- Um char pode receber um valor inteiro.

        System.out.println("ch is now " + ch);
    }
}
