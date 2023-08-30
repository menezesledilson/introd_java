public class MyClass1 {
    int x;

    MyClass1() {
        System.out.println("inside MyClass(). ");
        x = 0;
    }
    MyClass1(int i) {
        System.out.println("Inside MyClass(int) .");
        x = 1;
    }
    MyClass1(double d) {
        System.out.println("Inside MyClass (double).");
        x = (int) d;
    }
    MyClass1(int i, int j) {
        System.out.println("Inside MyClass(int, int)");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1(88); // Change this line to pass 88 as an argument
        MyClass1 t3 = new MyClass1(17.23);
        MyClass1 t4 = new MyClass1(2, 4);

        System.out.println("t1x: " + t1.x);
        System.out.println("t2x: " + t2.x);
        System.out.println("t3x: " + t3.x);
        System.out.println("t4x: " + t4.x);
    }
}

