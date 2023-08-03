package array;
/*
* tente Isto 5-1
* Demonstra a classificação por bolha
* */
public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10; // número de elementos a serem classificados

        //exibe o array o  original
        System.out.print("Original array is: ");
        for(int i =0; i < size; i++)
        System.out.print(" " + nums[i]);
        System.out.println();

        //Está é a classificação por bolha
        for( a = 1; a < size; a++)
            for( b = size -1; b >= a; b--){
                if(nums[b-1] > nums [b]){// se fora de ordem
                    //troca elementos
                    t= nums[b -1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
           //exibe o array classificado
        System.out.print("Sorted arrays is: ");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }

}
