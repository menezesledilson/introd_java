package exemplos;

public class Empty2 {
    public static  void main (String[] args){
        int i;

        i =0; // move a inicialização para fora do laço
        for (; i < 10;){
            System.out.println("Pass # " + i);
            i++; // incrementando a variável de controle de laço
        }
    }
}
