package exemplos;

public class BreakErr {
    //Esse contem erro
    public static void main (String []  args){
        one : for( int i = 0; i < 3; i++){
            System.out.println("Pass" + i + ": ");
        }
        for (int j =0; j < 100; j++){
            if( j == 10 ) break ; //one inserindo aqui da mensagem de erro é não executa
            System.out.println(j + " ");
        }
    }
}
