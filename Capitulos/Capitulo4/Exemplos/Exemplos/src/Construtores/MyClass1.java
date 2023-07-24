package Construtores;

public class MyClass1 {
    int x;

    MyClass1(int i) { // Construtor da classe
        x = i; // Inicialização da variável de instância
    }

    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1(10);
        MyClass1 t2 = new MyClass1(88);

        System.out.println(t1.x + " " + t2.x);
    }
}