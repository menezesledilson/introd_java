package Atividade;

public class NumerosPrimos {

    public static void main(String[] args) {
        int i, j;
        boolean imprimi;

        for (i = 2; i < 100; i++) {
            imprimi = true;
            //vê se o numero tem dvisão exata
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    imprimi = false;
            if (imprimi)
                System.out.println("Os números são: " + i);
        }
    }
}
