/*Usando super para resovler o problema de ocultaão de nomes */
public class ExemploA {
    int i;
}
//Crua uma subclasse estendo a classe A;

class  B extends ExemploA {
     int i; // essa variavél i oculta a variável i de A
    B(int a, int b ){
        super.i = a; // i de A aquie, super.i referencia a variavel i de a
        i  = b; // i de B
    }
    void show(){
        System.out.println("i in superClass: " + super.i);
        System.out.println("i in superClass: " + i);
    }
}
class Usersuper{
     public  static  void main (String args[]){
         B subOb = new B(1,2);
         subOb.show();
     }
}
