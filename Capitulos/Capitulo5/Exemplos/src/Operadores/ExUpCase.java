package Operadores;

public class ExUpCase {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            //Essa insrução desativa o 60 bit
            ch = (char) ((int) ch & 65503); // agora o ch é maiuscula
            System.out.print( ch + " ");
        }

    }
}
