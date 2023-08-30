public class StaticDemo {
    int x; /// uma variravel de instancia comum
        static int y ; // uma variável estática

    //retorna a soma da variavel de instância x  e a variavel estática y.

    int sum (){
        return x + y;
    }
}

class Demo{
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // cada objeto tem sua própria cópia de uma variavel de instancia.

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("of course, ob1.x and ob2.x" + "are independent");
        System.out.println("ob1.x:  " + ob1.x + "\nob2.x: " + ob2.x);

        System.out.println();

        //Cada objeto compartilja uma cópia de uma variavel estatica.

        System.out.println("the static variable y is shared");

        StaticDemo.y =19;

        System.out.println("Set staticDemo.y to 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());

        System.out.println();

        StaticDemo.y = 100;

        System.out.println("Change StaticDemo.y to 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
