abstract class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
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

    String getName() {
        return name;
    }

    abstract double area();
}

class Triangle9 extends TwoDShape9 {
    private String style;

    Triangle9(String style, double w, double h) {
        super(w, h, "Triangle");
        this.style = style;
    }

    Triangle9(double x) {
        super(x, "Triangle");
        style = "none";
    }

    Triangle9(Triangle9 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
}

class Rectangle9 extends TwoDShape9 {
    Rectangle9() {
        super();
    }

    Rectangle9(double w, double h) {
        super(w, h, "Rectangle");
    }

    Rectangle9(double x) {
        super(x, "Rectangle");
    }

    Rectangle9(Rectangle9 ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class ShapesApp {
    public static void main(String[] args) {
        TwoDShape9 shapes[] = new TwoDShape9[4];

        shapes[0] = new Triangle9("Outlined ", 8.0, 12.0);
        shapes[1] = new Rectangle9(10);
        shapes[2] = new Rectangle9(10, 4);
        shapes[3] = new Triangle9(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
