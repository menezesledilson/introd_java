package exemplos;

public class Guess {
    //Advinha a letra do jogo.

    public static void main(String[] args) throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Estou pensando em uma letra entre A e Z: ");

        System.out.println("Você consegue adivinhar? ");

        ch = (char) System.in.read(); //Lê um char no teclado

        if (ch == answer) {
            System.out.println("** Você acertou! **");
        }else {
            System.out.println("** ...Sorry, você Errou! **");
        }
    }
}
