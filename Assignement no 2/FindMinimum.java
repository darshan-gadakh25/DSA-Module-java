import java.util.*;

public class FindMinimum{
	static int i=0;
	
	// Using Recursion	
	static int minElement(int [] arr,int min){

		if( i == arr.length){
			return min;
		}
		if(arr[i] < min){
			min=arr[i];	
		}
		i++;
		return minElement(arr,min);
	}
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
	
		int min=minElement(arr,arr[0]);
		System.out.println("min element in array: "+min);
		
	}
}