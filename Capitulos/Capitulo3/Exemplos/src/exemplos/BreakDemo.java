package exemplos;

public class BreakDemo {
    //usando o break para sair do laço
    public static void main (String[] args){
        int num;

        num = 100;

        //executar o laço nequanto i ao quadrado é menor do que num

        for (int i= 0; i < num; i++ ){
            if( i  * i >= num ) break;; // envera o laço se  i * i >= 100
            System.out.println(i + " ");
        }
        System.out.println("Loop completo");
    }
}
