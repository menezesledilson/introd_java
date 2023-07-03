package Exemplos;

public class BoolDemo {
    //Demonstrar o valores booleanos.

    public static  void main (String[] args){

        boolean b;

        b= false;

        System.out.println("b is " + b);

        b = true;

        System.out.println("b is "+ b);

        //Um valor booleano pode controlar a instrução if

        if(b) System.out.println("This is executed. ");

        b = false;
        if (b) System.out.println("This is not executed. ");

        //o resultado de um operador relacional é um valor booleano

        System.out.println( "10 > 9  is " + (10 > 9));
    }
}
