package exemplos;

public class Break5 {
    //uso do break com rotulo
    public static void main(String[] args){
        done:
        for( int  i = 0; i< 10; i++){
            for( int j =0; j <10; j++){
                for(int k =0; k<10; k++){
                    System.out.println(k + " ");
                    if( k == 5) break done; // desvia para done
                }
                System.out.println("After k loop "); // não sera executado
            }
            System.out.println("After j loop "); // não sera executado
        }
        System.out.println("After i loop ");
    }
}
