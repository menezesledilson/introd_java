class Stack {
    private char stck[]; // esse array contém a pilha
    private int tos; // top da pilha

    // Constrói uma pilha vazia dado seu tamanho
    Stack(int size) {
        stck = new char[size]; // aloca memória para a pilha
        tos = 0;
    }

    // Constrói uma pilha a partir de outra
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // copia os elementos
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    // Constrói uma pilha com valores iniciais
    Stack(char a[]) {
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            stck[i] = a[i];
        }
        tos = a.length; // atualiza o top da pilha
    }

    // Insere caracteres na pilha
    void push(char ch) {
        if (tos == stck.length) {
            System.out.println("-- Stack is full");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    // Extrai um caractere da pilha
    char pop() {
        if (tos == 0) {
            System.out.println("-- Stack is empty");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

 class SDemo {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};

        // Constrói a pilha a partir do array
        Stack stk2 = new Stack(name);
        char ch;
        int i;

        // Insere alguns caracteres em stk1
        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        // Constrói uma pilha a partir de outra pilha
        Stack stk3 = new Stack(stk1);

        // Exibe pilhas
        System.out.println("Contents of stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Contents of stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
