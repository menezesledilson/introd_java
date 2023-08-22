
//Uma classe de fila de caracteres melhorada
public class Queue {
    // Agora esses membros são privados

    private char q[]; // esse array contém a fila

    private int putloc, getloc; // os índices put e get

    public Queue(int size) {
        q = new char[size]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caractere na fila
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("- Queue is full.");
            return; // Adicionado um retorno para sair da função após a mensagem
        }
        q[putloc++] = ch;
    }

    // Obtém um caractere na fila
    public char get() {
        if (getloc == putloc) {
            System.out.println("- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    public static void main(String[] args) {
        Queue test = new Queue(10);
        test.put('c'); // Colocando um caractere válido na fila
        char charFromQueue = test.get(); // Pegando o caractere da fila
        System.out.println("Char from queue: " + charFromQueue);
        test.putloc = -100; // Atribuição corrigida para testar o limite
    }
}
