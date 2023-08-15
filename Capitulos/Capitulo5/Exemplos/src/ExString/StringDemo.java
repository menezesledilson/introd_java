package ExString;

public class StringDemo {
    public static void main(String[] args) {
        String string1 = new String("java strings are objects.");
        String string2 = "they are constructe various ways";
        String string3 = new String(string2);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
}
