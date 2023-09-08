public class ExemploA3 {
    int i, j;

    ExemploA3(int a, int b) {
        i = a;
        j = b;
    }

    // Exibe i e j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B5 extends ExemploA3 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Exibe k - esta versão sobrepõe show() em A
    void show() {
        System.out.println("This is k: " + k);
        super.show();
    }
}

 class Overload3 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);

        subOb.show(); // Chama show() em B
    }
}
