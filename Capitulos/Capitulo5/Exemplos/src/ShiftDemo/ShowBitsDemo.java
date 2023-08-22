package ShiftDemo;


//uma classe que ezibe a representação binaria de uma valor

class Showbits{
    int numbits;
    Showbits(int n){
        numbits = n;
    }
    void show(long val){
        long mask = 1;

        //desloca um 1 para a esquerda para a posição apropriada
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0;  mask >>>= 1){
            if((val & mask) != 0)
                System.out.print("1");
            else
                System.out.print("0 ");
            spacer++;
            if((spacer % 8) == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
//Demonstra ShowBits.

public class ShowBitsDemo {
    public static void main(String[] args) {
        Showbits b = new Showbits( 8);
        Showbits i = new Showbits( 32);
        Showbits li = new Showbits( 64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        //Você também pode exbir os bits de ordem inferior de qualquer inteiro
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }

}
