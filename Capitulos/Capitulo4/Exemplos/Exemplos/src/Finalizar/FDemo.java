package Finalizar;

public class FDemo {
    int x;
    FDemo (int i){
        x= i;

    }
    //Chamada quando o objeto é reciclado
    protected  void  finalize(){
        System.out.println("Finalizing " +x);
    }
    //Gera um objeto que é imediatamente destruído
    void  generator (int i){
        FDemo o = new FDemo(i);
    }
    class  Finalize{
        public static void main(String[] args) {
            int count;
            FDemo ob = new FDemo(0);
            /*Agora, gere um grande número de objetos.
            * Em algum momento, a coloeta de lixo ocorrerá.
            * Nota: voce pode ter de aumentar o numero de objetos gerados para forçar a coleta de lixo*/
        for( count = 1 ; count < 1000; count++)
            ob.generator(count);
        }
    }
}
