package ShiftDemo;

public class Encode {
    public static void main(String[] args) {
        String msg = "this is a test";
        String encmg = " ";
        String decmg = " ";
        String key = "abcdefgi";
        int j;

        System.out.println("Original message ");
        System.out.println(msg);

        //codifica a mensagem
        j = 0;
        for( int i = 0; i < msg.length(); i ++ ){
            encmg += (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j ==8 ) j =0;
        }
        System.out.print("Encoded message: ");
        System.out.println(encmg);

        //decofica a mensagem
        j = 0;
        for(int i =0; i < msg.length(); i++){
            decmg+= (char)(encmg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == 8) j = 0;
        }
        System.out.print("Decoded message: ");
        System.out.println(decmg);
    }
}
