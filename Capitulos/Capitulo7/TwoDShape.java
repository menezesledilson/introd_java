public class TwoDShape {
    //Uma hieraquia de classe simples.

    //Uma classe para objetos de duas dimensões

    double width2;
    double height2;

    void showDim() {
        System.out.println("Width and heigth are " + width2 + " and " + height2);

    }
}

//Uma subclasse de  twoDshaoe para triangulos.
class Triangle extends TwoDShape1 {
    String style;
    private double height2;
    private double width2;

    double area() {
        return width2 * height2 / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1();

        t1.width2 = 4.0;
        t1.height2 = 4.0;
        t1.style = "filled";

        t2.width2 = 8.0;
        t2.height2 = 12.0;
        t2.style = "outlined";

        System.out.println("info for t1: ");
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
//Uma subClasse de TwoDshape para retangulos
class Rectangle extends TwoDShape1 {
    boolean isSquare(){
      if(width2 == height2) return true;
      return false;
    }
    double area(){
        return width2 * height2;
    }
    //membros privados não são herdados.
    //este exemplo não será compilado.
    //Uma classe para objetos bidimensionais.
    class TwoDShape{
        private double width; //agora esse
        private  double height; //membros são privados

        void showDim(){
            System.out.println("width and height are " + width + " and " + height);
        }
    }

    //Subclasse de twoDShape para triangulos.
    class Triangle extends TwoDShape{
        String style;
        double area(){
            return  width2 * height2 /2; // erro ! não pode acessar
        }
        void showStyle(){
            System.out.println("Triangle is " + style);
        }
    }

}
