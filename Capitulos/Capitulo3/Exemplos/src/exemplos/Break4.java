package exemplos;

public class Break4 {
    public static void main(String[] args){
        int i;

        for ( i =1; i <4; i++){
          one:{
           two:{
              three:{
               System.out.println("\ni is" + i);
               if( i == 1 ) break  one;
               if( i == 2 ) break  two;
               if( i == 3 ) break  three;

               //essa parte nunca sera alcançado
                  System.out.println("after block threee.");

              }
               System.out.println("after block two.");
           }
              System.out.println("after block one.");
          }
            System.out.println("after for.");
        }
    }
}
