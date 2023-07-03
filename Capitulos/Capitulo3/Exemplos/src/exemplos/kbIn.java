package exemplos;

import java.io.IOException;

public class kbIn {
    public static void main(String[] args) throws java.io.IOException {


        char ch;

        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); //Obtém um char <------ Lê um caractere no teclado

        System.out.println("Your key is: " + ch);

        System.out.println("O código funcionou!!");
    }

}
