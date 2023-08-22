//tipos primitivos são passado por valor
public class Test {
    /*
    * este metod não causa alteração nos argumentos usado na chamada*/

    void noChange(int i, int j){
        i = i + j;
        j =  -j;
    }
}
class  CallByValue{
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call:" + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
