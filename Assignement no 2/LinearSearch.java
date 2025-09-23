
import java.util.*;

public class LinearSearch{
	
	static int linearSearch(int [] arr, int i, int key){
		
		if( i == arr.length){
			return -1;
		}
		else{
			if(arr[i] == key){
				return i;
			}
			return linearSearch(arr,i+1,key);
		}
		
	}
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
		System.out.println();
		System.out.println("Please Enter the element to search in array:");
		int element=sc.nextInt();
		System.out.println("Elemenet found at index:");
		int index=linearSearch(arr,0,element);
		System.out.print(index);
		
	}
}