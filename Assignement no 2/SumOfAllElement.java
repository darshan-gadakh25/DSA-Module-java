import java.util.*;

public class SumOfAllElement{
	static int sum=0;
	static int sumOf(int [] arr, int i){
		
		if( i == arr.length){
			return 0;
		}
		else{
			sum += arr[i];
			sumOf(arr,i+1);
			return sum;
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
	
		int sum=sumOf(arr,0);
		System.out.println("sum of all element in array: "+sum);
		
	}
}