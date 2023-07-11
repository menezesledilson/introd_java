package exemplos;

public class ContToLabel {
    //usa contiue como rotulo
    public static void main (String[] args){
        outerloop:
        for (int i = 1; i <10; i++){
            System.out.println("\nouter loop pass " + i + ", inner loop: ");
            for ( int j = 1; j < 10; j++){
                if( j == 5 ) continue  outerloop;; // laço externo de continue
                System.out.println(j);
            }
        }
    }
}
