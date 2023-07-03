package exemplos;

public class ifsAninhados {
    public static void main(String[]args){

       int i = 0, a, b = 0, j = 0, k = 0, c = 0, d = 0;

        if (i == 10){
            if( j < 20) a = b;
            if ( k > 100) c = d;
            else a = c; //esse else é referente a if (k > 100)
        }
        else  a = d; //esse else é referente a if (i ==10)
    }
}
