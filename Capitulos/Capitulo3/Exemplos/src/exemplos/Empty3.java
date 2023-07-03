package exemplos;

public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum += i++) { //<-- não há corpo nesse laço
            System.out.println("Sum is # " + sum);

        }
    }
}
