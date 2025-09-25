import java.util.*;

public class FindMaximum{
	static int i=0;
	static int maxElement(int [] arr, int max){
		
		if( i == arr.length){
			return max;
		}
		if(arr[i] > max){
			max=arr[i];	
		}
		i++;
		return maxElement(arr, max);
	}
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
	
		int max=maxElement(arr, arr[0]);
		System.out.println("Max element in array: "+max);
		
	}
}