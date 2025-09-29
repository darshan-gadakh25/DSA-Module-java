import java.util.*;
public class StringArraySort{
	static void display(String [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static String[] sort(String arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j]) > 0){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		String [] arr=new String[size];
		System.out.println("Enter "+size+" element in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next();
		}
		
		
		System.out.println("Show actual array");
		display(arr);
		
		System.out.println();
		System.out.println("Show after Seletion sorting array");
		String [] sorted=sort(arr);
		display(sorted);
		
		
	}
}