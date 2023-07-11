package exemplos;

public class Break6 {

    //é importante onde o rotulo é inserido
    public static void main(String[] args) {
        int x = 0, y = 0;

        //aqui inseri o rotulo antes da instrução
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println(("X e y :" + x + " " + y));
            }
        }
        System.out.println();

        //agora, inserira o rotulo imediatamente antes de

        {

            for (x = 0; x < 5; x++) {
                stop2:
                {
                    for (y = 0; y < 5; y++) {
                        if (y == 2) break stop2;
                        System.out.println(" x e y: " + x + " " + y);
                    }
                }

            }
        }
    }
}