public class ExemploA4 {
    int i, j;
    ExemploA4(int a, int b){
        i = a;
        j = b;
    }
   //exibe i e j
    void show(){
        System.out.println("i and j : " + i + " " + j);
    }
}
class B4 extends ExemploA4 {
    int k;

    B4(int a, int b, int c){
        super(a, b);
        k = c;
    }
    //sobrecarrega show()
    void show( String msg) {

              System.out.println(msg + k);
    }
}
class Overload{
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);

        subOb.show("This is k :  ");//chama show() em B
        subOb.show(); // chama show() em A
    }

}
