import java.util.*;
public class CRUDHashSet{
	private static void operations(){
		 System.out.println("1. Add Element");
            System.out.println("2. Search Element");
            System.out.println("3 Display Elements");
            System.out.println("4 Exit");
            System.out.print("Enter your choice (1-4: ");
	}
	
	public static void main(String [] args){
		
		HashSet<String> list=new HashSet<>();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do{
			operations();
			 choice=scanner.nextInt();
			  scanner.nextLine();
			
			switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    list.add(elementToAdd);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.print("Enter element for serach: ");
                    String search = scanner.next();
                    scanner.nextLine(); 
					boolean found = false;
					for (String i : list) {
						if (i.equalsIgnoreCase(search)) {
							found = true;
							break;
						}
					}

					if (found) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
                    break;

                case 3:
                    System.out.println("HashSet Elements: " + list);
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