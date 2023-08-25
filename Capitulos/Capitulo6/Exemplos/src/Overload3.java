public class Overload3 {

    //adicione f(byte)
    void f(byte x){
        System.out.println("inside f (byte): " + x );
    }
    void f(int x){
        System.out.println("inside f (int): " + x );
    }
    void f(double x){
        System.out.println("inside f (double): " + x );
    }
}
class TypeConv{
    public static void main(String[] args) {
        Overload3 ob = new Overload3();
        int  i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // chama ob.f(int)
        ob.f(d); //Chama ob.f(double)

        ob.f(b); //Chama ob.f(byte) - agora, sem a conversão de tipo

        ob.f(s); //Chama ob.f(int)- conversão de tipo

        ob.f(f); //Chama ob.f(double)- conversão de tipo
    }
}
