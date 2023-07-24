package Construtores;

public class MyClass {
    int x = 10; // Variável de instância
    public static void main(String[] args) {

        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        t1.x = 20;
        t2.x = 30;

        System.out.println(t1.x + " " + t2.x);

    }
}