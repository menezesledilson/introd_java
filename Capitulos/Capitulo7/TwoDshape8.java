public class TwoDshape8 {
    private double width;
    private double height;
    private String name;

    // construção padrão
    TwoDshape8() {
        width = height = 0.0;
        name = "none";
    }

    // Construtor parametrizado
    TwoDshape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói objeto com largura e altura iguais
    TwoDshape8(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constroi um objeto a partir de outro
    TwoDshape8(TwoDshape8 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Métodos acessadores para width e height
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

    String getName() {
        return name;
    }

    void ShowDi() {
        System.out.println("width and height are " + width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

// Subclasse de TwoDshape para triângulos.
class Triangle8 extends TwoDshape8 {
    private String style;

    // Construtor padrão
    Triangle8() {
        super();
        style = "none";
    }

    // Construtor triangle
    Triangle8(String s, double w, double h) {
        super(w, h, "triangle8");
        style = s;
    }

    // Construtor com um argumento
    Triangle8(double x) {
        super(x, "triangle "); // chama construtor da superclasse
        style = "filled";
    }

    // Constroi um objeto a partir de outro
    Triangle8(Triangle8 ob) {
        super(ob); // passa objeto para construtor de TwoDshape
        style = ob.style;
    }

    // Sobrepoe area() para triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// Subclasse de TwoDShape para retângulos
class Rectangle8 extends TwoDshape8 {
    // Construtor padrão
    Rectangle8() {
        super();
    }

    // Construtor para Rectangle
    Rectangle8(double w, double h) {
        super(w, h, "rectangle "); // Chama construtor da superClasse
    }

    // Construtor para Quadrado
    Rectangle8(double x) {
        super(x, "rectangle "); // Chama construtor da superClasse
    }

    // Constroi a partir de outro
    Rectangle8(Rectangle8 ob) {
        super(ob); // passa objeto para construtor de TwoDshape
    }

    boolean isSquare8() {
        if (getWidth() == getHeight())
            return true;
        return false;
    }

    // Sobrepõe area() para rectangle
    double area() {
        return getWidth() * getHeight();
    }
}

class DynShapes8 {
    public static void main(String[] args) {
        TwoDshape8 shapes[] = new TwoDshape8[5];

        shapes[0] = new Triangle8("Outlined ", 8.0, 12.0);
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10, 4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDshape8(10, 20, "Generic");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
