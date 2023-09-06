public class TwoDShape4 {

    private double width4;
    private double height4;

    //Construtor parametrizado

    TwoDShape4(double w4, double h4){
        width4 = w4;
        height4 = h4;

    }
    //metods acessadores para width e heigth

    double getWidth4(){return width4;}
    double getHeight4(){return height4;}

    void setWidth4(double w){width4 = w;}
    void setHeight4(double h){height4 = h;}

    void showDim(){
        System.out.println("width and height are " + width4 + " and " + height4 );
    }
}
//subclasse de twoDshape para triangulos

class Triangle4 extends TwoDShape4{
    private  String style4;

    Triangle4 (String s, double w, double h){
        super(w, h); //chama construtor da superclasse

        style4 = s;
    }
    double area (){
        return getWidth4() * getWidth4() / 2;
    }
    void showStyle4() {
        System.out.println("Trinagle is " + style4);
    }

}
class Shapes4{
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);

        System.out.println("info for t1: ");
        t1.showStyle4();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("info for t2: ");
        t2.showStyle4();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }
}
