package Exemplos;

public class VarInitDemo {
    /*Demonstra o tempo de vida de uma variável*/
    public static void main(String[] args){
        int x;

        for (x = 0; x < 3; x++ ){
           int y = -1; //Y será inicializada sempre que entrarmos no bloco.
           System.out.println("y is:  " + y); //Essa linha sempre exibe -1.
           y = 100;
           System.out.println(" y is now: " + y);
        }
    }
}
