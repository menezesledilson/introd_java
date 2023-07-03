package exemplos;

public class Guess3 {

    public static void main(String[] args) throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Estou pensando em uma letra entre A e Z: ");

        System.out.println("Você consegue adivinhar? ");

        ch = (char) System.in.read(); //obtém um char

        if (ch == answer) {
            System.out.println("** Você acertou! **");
        } else {
            System.out.println("** ...Sorry, você Errou! **");

            if (ch < answer) System.out.println("too low");

            else System.out.println("too high");
        }
    }
}
