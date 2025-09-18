import java.util.*;
class Array{
	private int[] arr;
	private int n=0;
	
	public Array(int max){
	arr=new int[max];
	n=0;
	}
	
	void display(){
		for(int i=0;i< n;i++){
		System.out.print(arr[i]+" ");
		}
	}
	
	void insert(int num){
		arr[n]=num;
		n++;
	}
	
	boolean serach(int value){
	int i;
		for(i=0;i<n;i++)
			if(arr[i] ==  value)
				break;
		
		if(i == n)
		 return false;
		else
		return true;	
	}
	
	boolean deletion(int num){
		System.out.println("before"+n);
		int i;
		for(i=0;i<n;i++){
			if(arr[i] ==  num){
				break;
			}	
		}
		if(i==n){
			return false;
		}
		else {
		for(int j= i;j<n-1;j++)
			arr[j]=arr[j+1];
		n--;
		
		System.out.println("after"+n);
		return true;
		}
	}
	
	int binearySerach(int arr[],int value, int l,int h){
		if(h >= l){
			int mid = l + (h - l) / 2;
			
			if(arr[mid] == value)
				return mid;
			else if(arr[mid] > value)
				return binearySerach(arr,value,l,mid -1);
	
			else
				return binearySerach(arr,value,mid + 1,h);
			
		}	
		return -1;

	}
}
public class ArrayDemo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int size=100;
		Array a=new Array(size);
		a.insert(43);
		a.insert(63);
		a.insert(49);
		a.insert(43);
		a.insert(19);
		a.insert(9);

		System.out.println("Show array element");

		a.display();
		System.out.println();
		
	/*
	System.out.println("sertching element found :" +a.serach(43));
	
	//System.out.println("deleted element  :" +a.deletion(43));

	System.out.println("Show array element");
	a.display();
	*/
	int arr[]={21,4,3,65,7,65,34,8};
	Arrays.sort(arr);
		System.out.println("Binary search element  :" +a.binearySerach(arr,3,0,arr.length-1));

	}
}