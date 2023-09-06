class TwoDShape1 {
    double width2;
    double height2;

    double getWidth() {
        return width2;
    }

    double getHeight() {
        return height2;
    }

    void setWidth(double w) {
        width2 = w;
    }

    void setHeight(double h) {
        height2 = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width2 + " and " + height2);
    }
}

class Triangle1 extends TwoDShape1 {
    String style;

    Triangle1() {
        style = "none";
    }

    Triangle1(double w, double h, String s) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1(4.0, 4.0, "filled");
        Triangle1 t2 = new Triangle1(8.0, 12.0, "outlined");

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
