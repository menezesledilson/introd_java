public class ExemploA1 {

    class A {
        A() {
            System.out.println("constructing A");
        }
    }

    class B extends A {
        B() {
            System.out.println("constructing B");
        }
    }

    class C extends B {
        C() {
            System.out.println("constructing C");
        }
    }

    public static void main(String[] args) {
        C c = new ExemploA1().new C();
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        ExemploA1.C c = new ExemploA1().new C();
    }
}
