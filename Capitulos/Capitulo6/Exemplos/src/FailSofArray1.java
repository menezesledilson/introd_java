import javax.sound.midi.SysexMessage;

public class FailSofArray1 {

    class FailSoftArray {

        private int[] a; // referência ao array
        private int errval; // valor a ser retornado se get() falhar

        public int length; // length é pública

        /* Constrói o array dado seu tamanho e o valor a ser retornado se get() falhar */

        public FailSoftArray(int size, int errv) {
            a = new int[size];
            errval = errv;
            length = size;
        }

        // Retorna o valor do índice especificado.
        public int get(int index) {
            if (indexOk(index)) return a[index];
            return errval;
        }

        // Insere um valor em um índice. Retorna false em caso de falha.
        public boolean put(int index, int val) {
            if (indexOk(index)) {
                a[index] = val;
                return true;
            }
            return false;
        }

        // Retorna true se index estiver dentro dos limites.
        private boolean indexOk(int index) {
            if (index >= 0 && index < length) return true;
            return false;
        }
    }

    // Demonstra o array resistente a falhas.
    class FSDemo {
        public void runDemo() {
            FailSoftArray fs = new FailSoftArray(5, -1);
            int x;

            // Exibe falhas silenciosas
            System.out.println("Fail quietly.");

            for (int i = 0; i < (fs.length * 2); i++)
                fs.put(i, i * 10);

            for (int i = 0; i < fs.length * 2; i++) {
                x = fs.get(i);
                if (x != -1) System.out.print(x + " ");
            }
            System.out.println("");

            // Agora, trata as falhas
            System.out.println("\nFail with error reports ");
            for (int i = 0; i < (fs.length * 2); i++) {
                if (!fs.put(i, i * 10))
                    System.out.println("Index " + i + " out-of-bounds");
            }

            for (int i = 0; i < (fs.length * 2); i++) {
                x = fs.get(i);
                if (x != -1) System.out.print(x + " ");
                else
                    System.out.println("Index " + i + " out-of-bounds");
            }
        }
    }

    public static void main(String[] args) {
        FailSofArray1 failSofArray1 = new FailSofArray1();
        FSDemo fsDemo = failSofArray1.new FSDemo();
        fsDemo.runDemo();
    }
}

