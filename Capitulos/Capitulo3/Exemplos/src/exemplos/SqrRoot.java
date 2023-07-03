package exemplos;

public class SqrRoot {

    // exibe a raiz quadrada de 1  a 99 e o erro de arredondamento.

    public  static void main(String[] args){
        double num, sroot = 0, rerr;

        for ( num = 1.0; num < 100.0; num++){
            System.out.println("a raiz quadrada: " + num + " é: " + sroot);

            //calcula o erro de arredondamento
            rerr = num - (sroot * sroot);
            System.out.println();
        }
    }
}
