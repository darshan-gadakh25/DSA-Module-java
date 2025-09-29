class ArrayOperation{

	int []arr;
	int n;
	
	ArrayOperation(int size){
		arr=new int[size];
		n=0;
	}
	
	void display(){
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	void insert(int value){
		arr[n]=value;
		n++;
	}
	/*
	void deletion(int value){
		if(arr == null){
			System.out.println("The array is empty.");
		}
		int i;
		for( i=0;i<n;i++){
			if(arr[i] ==  value){
				arr[i]=arr[i+1];
				n--;
			}
		}
	}*/
	
	boolean deletion1(int values){
		if(arr == null){
			return false;
		}
		
		int i;
		for(i=0;i<n;i++){
			if(arr[i] == values){
				break;
			}
		}
		
		if(i==n){
			return false;
		}
		else{
			for(int j =i;j<n;j++){
				arr[j]=arr[j+1];
			}
			n--;
		}
		return true;
	}
	
	boolean linearSerach(int value){
		for(int i=0;i<n;i++){
			if(arr[i] == value){
				return true;
			}
		}
		return false;
	}
	
	int binearySearch(int []arr, int value,int l ,int h){
		if(h >= l){
			int mid = (l + h) /2;
		
			if(arr[mid] == value) return mid;
			else if( arr[mid] > value)
				return binearySearch(arr, value, 0, mid -1 );
			else 
				return binearySearch(arr, value, mid + 1, h );
		}
		return -1;
	}
}

class ArrayOperations{
	public static void main(String [] args){
		ArrayOperation a1=new ArrayOperation(100);
		a1.display();
		
		a1.insert(21);
		a1.insert(54);
		a1.insert(17);
		a1.insert(97);
		a1.insert(17);
		
		System.out.println("After inserting values:");
		a1.display();
		
		System.out.println();
		System.out.println("After removing element.");
		//a1.deletion1(17);
		//a1.deletion1(97);
		a1.display();
		
		System.out.println();
		System.out.println("Search element found?." +a1.linearSerach(174));
		
		int arr[]={1,3,5,6,7,8,9};		
		System.out.println();
		System.out.println("Binary Search element found."+a1.binearySearch(arr, 6,0,arr.length-1));
	
	}
}


/*
Scanner sc = new Scanner(System.in);
        int choice, key;
        do {
            System.out.println("\n--- Binary Search Tree Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
               
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
		*/