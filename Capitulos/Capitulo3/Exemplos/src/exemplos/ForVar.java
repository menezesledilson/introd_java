package exemplos;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        //calcula o fatorial dos núemos até 5

        for (int i = 1;
             i <= 5;
             i++) {
            sum += i; // é conhecida em todo o laço
            fact *= i;
        } //<---- variavel i é declara dentro da instruçã for.
        //Mas não é conhecida aqui
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}