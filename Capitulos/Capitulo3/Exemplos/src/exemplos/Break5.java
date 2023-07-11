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

    /*
    * A forma simple de usar um for
    * for (inicialização; condiçao; iteração) instrução
    *
    * Para a repetição de  um bloc, a forma geral é
    *
    * for (inicialização; condição; iteração
    * {
    * sequencia de instruções
    * }
    * */
    public static class Help {
        public static void  main (String[] args) throws  java.io.IOException{

            char choice;

            int cont = 0;
            do{
                System.out.println("help on: ");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("Choose one: ");

                choice = (char) System.in.read();


                System.out.println("\n ");


                switch (choice){
                    case '1' :
                        System.out.println("The if:\n");
                        System.out.println("if (condition) statement;");
                        System.out.println("else statement; ");
                        break;
                    case '2':
                        System.out.println("The switch:\n");
                        System.out.println("switch (expression){");
                        System.out.println("case constant: ");
                        System.out.println("statement sequence");
                        System.out.println("break; ");
                        System.out.println(" // ... ");
                        System.out.println("}");
                        break;
                    default:
                        System.out.println("Selection not found.");
                }
            } while (cont <= 3);

        }
    }
}
