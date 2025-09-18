import java.util.*;
public class CRUDTreeSet{
	private static void operations(){
		 System.out.println("1. Add employee");
            System.out.println("2. remove employee");
            System.out.println("3 Display employees in sorting order");
            System.out.println("4 Exit");
            System.out.print("Enter your choice (1-4: ");
	}
	
	public static void main(String [] args){
		
		TreeSet<String> list=new TreeSet<>();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do{
			operations();
			 choice=scanner.nextInt();
			  scanner.nextLine();
			
			switch (choice) {
                case 1:
                    System.out.print("Enter employee to add: ");
                    String employeeToAdd = scanner.nextLine();
                    list.add(employeeToAdd);
                    System.out.println("employee added.");
                    break;

                case 2:
                    System.out.print("Enter employee name to remove: ");
                    String name = scanner.next();
                    if (list.contains(name)) {
                        list.remove(name);
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.println("HashSet employees: " + list);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        } while (choice != 4);	
	}
}