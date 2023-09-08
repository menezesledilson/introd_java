class ExemploA2 {
    int i;
}

class B2 extends ExemploA2 {
    int i;

    B2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in super class: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

