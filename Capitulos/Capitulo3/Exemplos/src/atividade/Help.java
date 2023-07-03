package atividade;

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
public class Help {
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
