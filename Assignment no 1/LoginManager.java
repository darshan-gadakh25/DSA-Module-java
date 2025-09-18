import java.util.*;

public class LoginManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> logins = new LinkedHashMap<>();

        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            switch (command.toUpperCase()) {
                case "ADD":
                    String username = input[1];
                    String password = input[2];
                    logins.put(username, password);
                    break;

                case "UPDATE":
                    username = input[1];
                    password = input[2];
                    if (logins.containsKey(username)) {
                        logins.put(username, password);
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;

                case "REMOVE":
                    username = input[1];
                    System.out.println(logins.remove(username) != null);
                    break;

                case "DISPLAY":
                    System.out.println(logins);
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
