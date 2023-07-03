package Exemplos;

public class teoremaPitagoras {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y); // O Sqrt() é chamado. Ele é precedido  pelo nome da classe da qual é mesmo
        System.out.println("Hipotenusa " + z);
    }
}
