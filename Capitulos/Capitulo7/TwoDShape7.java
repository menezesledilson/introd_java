// Correção: Renomeie a classe twoDShape7 para TwoDShape7 (case-sensitive)
public class TwoDShape7 {
    private double width;
    private double height;


    TwoDShape7() {
        width = height = 0.0;
    }

    // Correção: Corrija o nome do construtor parametrizado para TwoDShape7 (case-sensitive)
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    // Correção: Corrija o nome do construtor com um argumento para TwoDShape7 (case-sensitive)
    TwoDShape7(double x) {
        width = height = x;
    }

    // Correção: Corrija o nome do construtor a partir de outro objeto para TwoDShape7 (case-sensitive)
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// Correção: Renomeie a classe triangle para Triangle (case-sensitive)
class Triangle7 extends TwoDShape7 {
    private String style;

    // Correção: Corrija o nome do construtor padrão para Triangle (case-sensitive)
    Triangle7() {
        super();
        style = "none";
    }

    // Correção: Corrija o nome do construtor parametrizado para Triangle (case-sensitive)
    Triangle7(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    // Correção: Corrija o nome do construtor com um argumento para Triangle (case-sensitive)
    Triangle7(double x) {
        super(x);
        style = "filled";
    }

    // Correção: Corrija o nome do construtor a partir de outro objeto para Triangle (case-sensitive)
    Triangle7(Triangle7 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2; // Correção: getWidth() e getHeight() são métodos, então use () para chamá-los
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

 class Shape7 {
    public static void main(String[] args) {
        // Correção: Use o nome correto da classe Triangle (case-sensitive) ao criar objetos
        Triangle7 t1 = new Triangle7("outlined", 8.0, 12.0);

        // Correção: Use o nome correto da classe Triangle (case-sensitive) ao criar objetos
        Triangle7 t2 = new Triangle7(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
