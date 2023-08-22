public class MyClass {

    private int alpha; //acesso privado

    public int beta; //acesso publico
    int gamma; // acesso padrão

    /*
    * Método para acessar alpha. Não há problema em um membro
    * de uma classe acessar um membro privado da messa classe
    * */

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
    class AcessDemo{
        public static void main(String[] args) {
            MyClass ob = new MyClass();
            /*
            * o acesso a alpha só é permitod por intermédio de seus métoos acessadoes.*/

            ob.setAlpha (-99);
            System.out.println("ob. alpha is " + ob.getAlpha());

            //Você não pode acessar alpha dessa forma;
            // ob.alpha = 10 Errado! alpha é privado! <---- errado alpha é privado!

            // Essas linhas estão corretas porque beta e gamma são públicos.
            ob.beta = 88; //<----- Certo porque esses mebros são públicos
            ob.gamma = 99 ;

        }
    }
}
