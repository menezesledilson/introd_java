package exemplos;

public class noBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1, 2 or 3");
                    break;
                case 4:
                    System.out.println(" i is 4");
                    break;
            }
        }
    }


//       for( i = 0; i <= 5; i++){
//           switch (i) {
//               case 0:
//                   System.out.println("I is less than one");
//               case 1:
//                   System.out.println("I is less than two");
//               case 2:
//                   System.out.println("I is less than three");
//               case 3:
//                   System.out.println("I is less than four");
//               case 4:
//                   System.out.println("I is less than five");
//           }
//           System.out.println();
//       }
//    }
}
