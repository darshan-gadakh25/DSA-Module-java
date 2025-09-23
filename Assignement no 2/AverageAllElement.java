import java.util.*;

public class AverageAllElement{
	static int sum=0;
	static double average(int [] arr, int i){
		
		if( i == arr.length){
			return 0;
		}
		else{
			sum += arr[i];
			average(arr,i+1);
			return sum / arr.length;
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
	
		double avg=average(arr,0);
		System.out.println("Average of all element in array: "+avg);
		
	}
}