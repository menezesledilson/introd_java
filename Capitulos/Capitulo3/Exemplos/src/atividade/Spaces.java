package atividade;

import java.io.IOException;

public class Spaces {
    // conta espaços
    public static void main (String[] args) throws IOException {
        char ch;
        int spaces = 0;
        System.out.println("Enter a preiod to stop");
        do{
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch !='.');
        System.out.println("Spaces: " + spaces);
    }
}
