package Exemplos;

public class ProDemo {
    //o inesperado em uma promoção!
    public static void main (String[] args){
        byte b;
        int i;
        b =10;
        i = b * b; // Certo, não é necessária uma coerção / pq o resultado já é elevado a int

        b =10;
        i = (byte) (b* b); // Coerção ncessária!

        System.out.println("i and b:" + i + " " + b);
    }
}
