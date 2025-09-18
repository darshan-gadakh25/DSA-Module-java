import java.util.*;
public class CRUDLinkedList{
	private static void operations(){
		 System.out.println("1. Add Element");
            System.out.println("2. Update Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Display Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
	}
	
	public static void main(String [] args){
		
		LinkedList<String> list=new LinkedList<>();
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
                    System.out.print("Enter index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); 
                    if (updateIndex >= 0 && updateIndex < list.size()) {
                        System.out.print("Enter new element: ");
                        String newElement = scanner.nextLine();
                        list.set(updateIndex, newElement);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < list.size()) {
                        list.remove(removeIndex);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.println("LinkedList Elements: " + list);
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        } while (choice != 5);	
	}
}