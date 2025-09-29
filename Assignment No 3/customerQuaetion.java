```java
import java.util.*;

// ------------------- 1. Arrays – Cricket Scores Analyzer -------------------
class CricketScoresAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];

        System.out.println("Enter scores of 10 players:");
        for (int i = 0; i < 10; i++) {
            scores[i] = sc.nextInt();
        }

        int max = scores[0], min = scores[0], sum = 0;
        for (int score : scores) {
            if (score > max) max = score;
            if (score < min) min = score;
            sum += score;
        }
        double avg = (double) sum / scores.length;

        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Team Average: " + avg);
        System.out.println("Players scoring above average:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > avg)
                System.out.println("Player " + (i + 1) + " : " + scores[i]);
        }
    }
}

// ------------------- 2. Sorting – College Election Votes -------------------
class CollegeElectionVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[15];

        System.out.println("Enter names of 15 candidates:");
        for (int i = 0; i < 15; i++) {
            names[i] = sc.next();
        }

        // Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted candidate list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// ------------------- 3. Searching – Movie Ticket Booking -------------------
class MovieTicketBooking {
    // Linear Search
    static boolean linearSearch(int[] arr, int key) {
        for (int x : arr) {
            if (x == key) return true;
        }
        return false;
    }

    // Binary Search
    static boolean binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) return true;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] booked = {5, 20, 35, 50, 67, 89, 95}; // already booked seats

        System.out.print("Enter seat number to check: ");
        int seat = sc.nextInt();

        System.out.println("Linear Search: " +
                (linearSearch(booked, seat) ? "Booked" : "Available"));

        Arrays.sort(booked); // must be sorted
        System.out.println("Binary Search: " +
                (binarySearch(booked, seat) ? "Booked" : "Available"));
    }
}

// ------------------- 4. LinkedList – Food Delivery Queue -------------------
class FoodOrder {
    int orderId;
    String customer;
    FoodOrder next;

    FoodOrder(int id, String name) {
        orderId = id;
        customer = name;
        next = null;
    }
}

class FoodDeliverySystem {
    FoodOrder head, tail;

    // Add at end
    void addOrder(int id, String name) {
        FoodOrder newOrder = new FoodOrder(id, name);
        if (head == null) {
            head = tail = newOrder;
        } else {
            tail.next = newOrder;
            tail = newOrder;
        }
    }

    // VIP Order at beginning
    void addPriorityOrder(int id, String name) {
        FoodOrder newOrder = new FoodOrder(id, name);
        newOrder.next = head;
        head = newOrder;
        if (tail == null) tail = newOrder;
    }

    // Deliver order (remove from beginning)
    void deliverOrder() {
        if (head == null) {
            System.out.println("No orders to deliver.");
            return;
        }
        System.out.println("Delivered: " + head.orderId + " (" + head.customer + ")");
        head = head.next;
        if (head == null) tail = null;
    }

    // Display pending
    void displayOrders() {
        if (head == null) {
            System.out.println("No pending orders.");
            return;
        }
        FoodOrder temp = head;
        System.out.println("Pending Orders:");
        while (temp != null) {
            System.out.println(temp.orderId + " - " + temp.customer);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        FoodDeliverySystem fds = new FoodDeliverySystem();
        fds.addOrder(101, "Alice");
        fds.addOrder(102, "Bob");
        fds.addPriorityOrder(999, "VIP John");
        fds.displayOrders();
        fds.deliverOrder();
        fds.displayOrders();
    }
}

// ------------------- 5. Stack – Parking Lot Simulation -------------------
class ParkingLot {
    Stack<String> parking = new Stack<>();

    void parkCar(String car) {
        parking.push(car);
        System.out.println(car + " parked.");
    }

    void exitCar() {
        if (parking.isEmpty()) {
            System.out.println("No cars to exit.");
        } else {
            System.out.println(parking.pop() + " exited.");
        }
    }

    void showCars() {
        System.out.println("Cars in parking: " + parking);
    }

    // Bonus: car leaves from middle
    void removeCar(String car) {
        Stack<String> temp = new Stack<>();
        boolean found = false;
        while (!parking.isEmpty()) {
            String top = parking.pop();
            if (top.equals(car)) {
                System.out.println(car + " has left the parking.");
                found = true;
                break;
            } else {
                temp.push(top);
            }
        }
        while (!temp.isEmpty()) {
            parking.push(temp.pop());
        }
        if (!found) System.out.println(car + " not found.");
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        lot.parkCar("CarA");
        lot.parkCar("CarB");
        lot.parkCar("CarC");
        lot.showCars();
        lot.removeCar("CarB");
        lot.showCars();
    }
}

// ------------------- 6. BST – Student Admission IDs -------------------
class BSTNode {
    int id;
    BSTNode left, right;

    BSTNode(int id) {
        this.id = id;
        left = right = null;
    }
}

class StudentBST {
    BSTNode root;

    void insert(int id) {
        root = insertRec(root, id);
    }

    BSTNode insertRec(BSTNode root, int id) {
        if (root == null) return new BSTNode(id);
        if (id < root.id) root.left = insertRec(root.left, id);
        else if (id > root.id) root.right = insertRec(root.right, id);
        return root;
    }

    boolean search(int id) {
        return searchRec(root, id);
    }

    boolean searchRec(BSTNode root, int id) {
        if (root == null) return false;
        if (root.id == id) return true;
        return id < root.id ? searchRec(root.left, id) : searchRec(root.right, id);
    }

    void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.id + " ");
            inorder(root.right);
        }
    }

    void preorder(BSTNode root) {
        if (root != null) {
            System.out.print(root.id + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        StudentBST bst = new StudentBST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder (Sorted IDs): ");
        bst.inorder(bst.root);

        System.out.println("\nPreorder (Admission sequence): ");
        bst.preorder(bst.root);

        System.out.println("\nSearch 40: " + (bst.search(40) ? "Found" : "Not Found"));
    }
}
```
