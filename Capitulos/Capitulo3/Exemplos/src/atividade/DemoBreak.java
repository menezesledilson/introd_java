package atividade;

import java.io.IOException;

public class DemoBreak {
    public static void main(String[] args) throws IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter preiod to stop.");
        do{
            ch = (char) System.in.read();
            if(ch >= 'a' & ch <= 'z'){
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch  >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }

        }while (ch != '.');
        System.out.println("Case changes: " +changes);
    }
}
