package exemplos;

import java.io.IOException;

public class BreakDemo2 {
    //lê a entrada até o que ser recebido
    public static void main (String[] args) throws IOException {
       char ch;

       for (; ; ){ //laço é infinito
            ch = (char) System.in.read();
            if(ch == 'q') break; // aqui encerrar o laço
        }
        System.out.println("You pressed q!");
    }
}
