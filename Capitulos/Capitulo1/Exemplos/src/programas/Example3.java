package programas;

public class Example3 {
    /*
     * Esse programa inlustra a diferença int e double
     * */

    public static void main(String[] args) {

        int var; // está instrução declaraa uma variável int.
        double x; // essa instrução declara uma variável de ponto flutuante.
        var = 10; // atribui a var o valor 10
        x = 10.0; // atribui a x o valor 10,0

        System.out.println("\nOriginal value of var: " + var);
        System.out.println("Original value of x: " + x);

        //Agora devide as duas por 4

        var = var / 4;
        x = x / 4;

        System.out.println("\nvar after division: " + var); //Ponto não preservado igual 2
        System.out.println("x after division: " + x);//Ponto preservado igual 2.5

    }
}
