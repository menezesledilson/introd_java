public class AssignARef {
    public static void main(String[] args) {

        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++)
            nums1[i] = i;

        for (i = 0; i < 10; i++)
            nums2[i] = -i;

        System.out.print("aqui está nums1: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("aqui está nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;  // Agora nums2 referencia nums1 -> atribuindo uma variável de referência

        System.out.print("aqui está nums2 após a atribuição: ");
        for (i = 0; i < 10; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Agora, operando no array nums2 afeta também nums1
        nums2[3] = 99;

        System.out.print("aqui está nums1 após a alteração através de nums2: ");
        for (i = 0; i < 10; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}
