import java.util.*;

public class BookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> books = new HashMap<>();

        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            switch (command.toUpperCase()) {
                case "ADD":
                    int id = Integer.parseInt(input[1]);
                    String title = input[2];
                    books.put(id, title);
                    break;

                case "UPDATE":
                    id = Integer.parseInt(input[1]);
                    title = input[2];
                    if (books.containsKey(id)) {
                        books.put(id, title);
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;

                case "REMOVE":
                    id = Integer.parseInt(input[1]);
                    System.out.println(books.remove(id) != null);
                    break;

                case "DISPLAY":
                    TreeMap<Integer, String> sorted = new TreeMap<>(books);
                    System.out.println(sorted);
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
