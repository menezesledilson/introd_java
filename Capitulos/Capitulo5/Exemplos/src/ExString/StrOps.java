package ExString;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "when it comes to web prorgamaming, Java is #1";
        String str2 = new String(str1);
        String str3 = "java strings are powerful";

        int result, idx;
        char ch;

        System.out.println("Lenght of str1:" + str1.length());

        //exibe umm caractere de cada vez de str1

        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("Str1 equals str2");
        else
            System.out.println("str1 does not equals str2");

        if (str1.equals(str3))
            System.out.println("Str1 equals str3");
        else
            System.out.println("str1 does not equals str3");
        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and str3 are equal");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        //atribui um novo string a str2
        str2 = "one two three one";

        idx= str2.indexOf("one");
        System.out.println("Index of first occurence of one: " +idx);
        idx = str2.lastIndexOf("one");
        System.out.println("Index of last occurrence of one: " + idx);

    }
}
