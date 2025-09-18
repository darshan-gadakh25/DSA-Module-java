import java.io.*;
import java.util.*;

interface BMW {
    void showDetails();
    void maxSpeed();
}

class BMWSeries3 implements BMW {
    public void showDetails() {
        System.out.println("BMW Series 3");
    }

    public void maxSpeed() {
        System.out.println("Max speed is 240 km/h");
    }
}

class BMWSeries5 implements BMW {
    public void showDetails() {
        System.out.println("BMW Series 5");
    }

    public void maxSpeed() {
        System.out.println("Max speed is 260 km/h");
    }
}

class BMWSeries7 implements BMW {
    public void showDetails() {
        System.out.println("BMW Series 7");
    }

    public void maxSpeed() {
        System.out.println("Max speed is 300 km/h");
    }
}

public class VehiacalManagementar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            String[] vehicles = new String[n];
            for (int i = 0; i < n; i++) {
                vehicles[i] = sc.nextLine();
            }

            try {
                if (vehicles.length < 3) {
                    throw new ArrayIndexOutOfBoundsException(String.valueOf(n));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception Caught: " + e);
            }

            for (int i = 0; i < n; i++) {
                try {
                    BMW car = null;

                    if (vehicles[i].equalsIgnoreCase("BMWSeries3")) {
                        car = new BMWSeries3();
                    } else if (vehicles[i].equalsIgnoreCase("BMWSeries5")) {
                        car = new BMWSeries5();
                    } else if (vehicles[i].equalsIgnoreCase("BMWSeries7")) {
                        car = new BMWSeries7();
                    } else {
                        throw new NumberFormatException("Invalid number format");
                    }

                    if (car == null) throw new NullPointerException();

                    car.showDetails();
                    car.maxSpeed();

                   
                    int x = 1 / 0;

                    
                    throw new IOException("Simulated IO error");

                } catch (ArithmeticException e) {
                    System.out.println("Exception Caught: " + e);
                } catch (NullPointerException e) {
                    System.out.println("Exception Caught: " + e);
                } catch (NumberFormatException e) {
                    System.out.println("Exception Caught: " + e);
                } catch (IOException e) {
                    System.out.println("Exception Caught: " + e);
                }
            }

        } catch (Exception e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
