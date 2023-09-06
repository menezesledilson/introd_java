public class TwoDShape3 {

    private double width;
    private double height;

    double getHeight3() {
        return height;
    }

    double getWidth3() {
        return width;
    }

    void setHeight3(double h) {
        height = h;
    }

    void setWidth3(double w) {
        width = w;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// Uma subclasse de TwoDShape3 para triângulos
class Triangle3 extends TwoDShape3 {
    private String style;

    // Construtor
    Triangle3(String s, double w, double h) {
        setHeight3(h);
        setWidth3(w);
        style = s;
    }

    double area() {
        return getWidth3() * getHeight3() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shape3 {

    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("filled", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
