package Instrucao;
/*
* Demonstra o laço for
* */
public class FOR {
  public static void main (String[]args){
      int count1;
      int count = 0;

      for (count1 = 0; count1 < 5; count1 = count1 + 1  ) // Esse lão itera 5 vezes.
          System.out.println("This is count: " + count1);

      System.out.println("Done!");

      count++;

      for (count = 0; count < 5; count++)
          System.out.println("This is count: " + count);

      System.out.println("Done!");

  }
}
