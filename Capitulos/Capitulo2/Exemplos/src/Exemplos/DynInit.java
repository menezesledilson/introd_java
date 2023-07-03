package Exemplos;

public class DynInit {
    //demosntra a inicialização dinâmica
    public static void main(String[] args){
        double radius = 4, height = 5;

        //inicializar volume dinamicamente
        double volume = 3.1416 * radius * radius * height; // o volume é inicializado dinamicamente no tempo de execução

        System.out.println("Volume é " + volume);
    }
}
