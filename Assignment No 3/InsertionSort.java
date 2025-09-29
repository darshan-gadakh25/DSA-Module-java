import java.util.*;
public class InsertionSort{
	static void display(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static int[] insertionSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int j = i - 1; 
			while (j >= 0 && arr[j] > temp) { 
				arr[j + 1] = arr[j]; j--; 
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter "+size+" element in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Show actual array");
		display(arr);
		
		System.out.println();
		System.out.println("Show after insertion sorting array");
		int [] sorted=insertionSort(arr);
		display(sorted);
		
		
	}
}