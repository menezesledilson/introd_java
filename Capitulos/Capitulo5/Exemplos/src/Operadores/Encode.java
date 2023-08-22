package Operadores;

public class Encode {
    public static void main(String[] args) {
        String msg ="This is a test";
        String encmsg =" ";
        String decmsg = " ";
        int key = 88;

        System.out.print("Original message: ");
        System.out.print(msg);

      //COdifica a mensagem
        for(int i =0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

            System.out.print("Encodede message: ");
            System.out.println(encmsg);

            //Decoficador de mensagem
            for(int i = 0; i < msg.length(); i++)
                decmsg += (char) (encmsg.charAt(i) ^ key);

        System.out.print("Encodede message: ");

        System.out.println(decmsg);
    }
}
