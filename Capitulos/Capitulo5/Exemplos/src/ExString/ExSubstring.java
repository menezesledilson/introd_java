package ExString;

public class ExSubstring {

    public static void main(String[] args) {
        String orgstr = "Java makes thes web move.";

        //constroi um substring
        String substr = orgstr.substring(5,18);

        System.out.println("orgstr: " + orgstr);
        System.out.print("substr: " + substr);
    }
}
