package ExString;

public class StringSwitch {

    private static String command;

    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {

            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "Disconnecting":
                System.out.println("Command Error!");
                break;
        }
    }
}
