package Exemplos;

public class LtoD {
    public static void main (String[]args){
        long L;
        double D;
        L =100123285L;
        D = L; //<--Conversão automática de Long para double;
        System.out.println("L and D: " + L + " " + D);
    }
}