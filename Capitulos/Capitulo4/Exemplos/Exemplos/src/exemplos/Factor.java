package exemplos;

public class Factor {

    //retorna true se x for par
    boolean isFactor(int a, int b) {    //<--------- Esse metodo tem dois parametro
        if ((b % a) == 0) return true;
        else return false;

    }

}
