import java.util.*;
public class BubbleSort{
	static void display(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static int[] bubbleSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			boolean swap=false;
			for(int j=0;j<arr.length - i-1;j++){
				if(arr[j] >= arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap){
				break;
			}
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
		System.out.println("Show after sorting array");
		int [] sorted=bubbleSort(arr);
		display(sorted);
		
		
	}
}