public class SumIt {
    int sumit(int ... n) {
        int result = 0;

        for (int i = 0; i < n.length; i++)
            result += n[i];

        return result;
    }
}
class  SuMDemo{
    public static void main(String[] args) {

        SumIt siObj = new SumIt();

        int total = siObj.sumit(1,2,3);
        System.out.println("sum is " + total);

        total = siObj.sumit(1,2,3,4,5);
        System.out.println("sum is " + total);
    }
}
