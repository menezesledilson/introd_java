//herarquia de varios niveis
public class TwoDShape6 {
    private double width;
    private double height;

    //Construtor padrão.
    TwoDShape6() {
        width = height = 0.0;
    }

    //Construtor parametrizado
    TwoDShape6(double w, double h) {
        width = w;
        height = h;

    }

    //constroi objeto com largura e altura iguais
    TwoDShape6(double x) {
        width = height = x;
    }

    //metodos acessadores para width e height
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
        width = h;
    }

    void showDim() {
        System.out.println("width and heigth are " + width + " and " + height);
    }

}
//Estende TwoDShape
class Triangle6 extends TwoDShape6{
    private  String style;

    //Construtor padrrão
    Triangle6(){
        super();
        style = "none";
    }
    Triangle6(String s, double w, double h){
        super(w, h); // chama construtor da superclasse

        style = s;
    }
    //construtor com arguments
    Triangle6 (double x){
        super(x); //chama construtor da superclasse

        style = "filled";

    }
    double area (){
        return getHeight() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
//Extends a triangle
class ColorTriangle extends Triangle6{
    private  String color;

    ColorTriangle(String c, String s,double w, double h) {
        super(s, w, h);
    }
    String getColor(){return color;}
    void showColor(){
        System.out.println("Color is " + color);
    }
}
class  Shapes6{
    public static void main(String[] args) {
        ColorTriangle t1 =
                new ColorTriangle("Blue" ,"Outlined",8.0, 12.0);
        ColorTriangle t2 =
                new ColorTriangle("Rede" ,"Filled",2.0, 2.0);

        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());


    }
}
