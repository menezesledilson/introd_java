package exemplos;
//Executar até a letra S ser digitada
public class ForTest {
    public static void main(String[]args) throws  java.io.IOException{

        int i ;
        System.out.println("press S to stop.");

        for( i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);
    }
}
