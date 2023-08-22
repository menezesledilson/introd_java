package ExString;

//Uma lista telefônica simples automatizado
public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", " 555-3322"},
                {"Mary", " 555-8976"},
                {"Tom", " 555-1400"},
        };
        int i;

        if(args.length !=1) //<---------Para o programa para ser usado, um argamento de linha de comando deve esta presente

            System.out.println("Usage: java Phone <name>");
        else {
            for ( i = 0; i < numbers.length; i ++){
                if (numbers [i] [0].equals(args [0])){
                    System.out.println(numbers[i][0] + ":" + numbers[i] [1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("not found.");
        }

    }
}
