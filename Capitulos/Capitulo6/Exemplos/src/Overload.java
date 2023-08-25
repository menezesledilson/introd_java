public class Overload {
    // Métodos sobrecarregados
    void ovlDemo() {
        System.out.println("No parameters");
    }

    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload(); // Use o nome correto da classe: Overload
        int resI;
        double resD;

        ob.ovlDemo(); // Chama o método ovlDemo() sem parâmetros
        System.out.println();

        resI = ob.ovlDemo(4, 6); // Chama o método ovlDemo(int a, int b)
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32); // Chama o método ovlDemo(double a, double b)
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
