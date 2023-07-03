package exemplos;

public class Guess4 {
    //advinha a letra do jogo  4ª versão
    public static void main(String[] args) throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("Estou pensando em uma letra entre A e Z: ");

            System.out.println("Você consegue adivinhar? ");

            ch = (char) System.in.read(); //lê um caractere

            //descarta qualquer outro cractere do buffer de entrada
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("** Você acertou! **");
            } else {
                System.out.println("** ...Sorry, você Errou! **");

                if (ch < answer) System.out.println("too low");

                else System.out.println("too high");
                System.out.println("try again! \n");
            }
        } while (answer != ch);
    }
}