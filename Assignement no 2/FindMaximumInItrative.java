import java.util.*;
class Array{
	int [] arr;
	int n;
	
	Array(int size){
		arr=new int[size];
		int n=0;
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
	
	
	int maxElement(){
		int max=arr[0];
		for(int i=0;i<n;i++){
			if( arr[i] > max)
				max=arr[i];
		}
		return max;
	}
	
	int minElement(){
		int min=arr[0];
		for(int i=0;i<n;i++){
			if( arr[i] < min)
				min=arr[i];
		}
		return min;
	}
	
	int sumOf(){
		int sum=0;
		for(int i=0;i<n;i++){
			sum += arr[i];
		}
		return sum;
	}
	
	int [] reverse(){
		for(int i=0;i<n/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
	
	void findEvenOddElement(){
		int even =0, odd=0;
		for(int i=0;i<n;i++){
			if(arr[i] % 2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even: "+even+", Odd: "+odd);
	}
	
	int linearSearch(int key){
		for(int i=0;i<n;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	
	int secondLargest(){
		int max=0;
		int secondMax=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] >max){
				secondMax=max;
				max=arr[i];
			} 
			else{
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
}

public class FindMaximumInItrative{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		Array  a1=new Array(size);
		
		for (int i = 0; i < size; i++) {
           a1.insert(sc.nextInt());
        }
	
		System.out.println("Show value in array");
		a1.display();

		System.out.println();
		int max=a1.maxElement();
		System.out.println("Max element in array: "+max);
		
		System.out.println();
		int min=a1.minElement();
		System.out.println("Min element in array: "+min);
		
		
		System.out.println();
		int sum=a1.sumOf();
		System.out.println("sum of all element in array: "+sum);
		
		/* System.out.println();
		int [] reverse=a1.reverse();
		System.out.println("Reverse element in array: ");
		a1.display(); */
		
		/* System.out.println();
		System.out.println("Elemenet Even Odd count:");
		a1.findEvenOddElement();
		
		System.out.println();
		System.out.println("Please Enter the element to search in array:");
		int element=sc.nextInt();
		System.out.println("Elemenet found at index:");
		int index=a1.linearSearch(element);
		System.out.print(index); */
		
		System.out.println();
		int secondMax=a1.secondLargest();
		System.out.println("Second Max Element in array: "+secondMax);

	
	}
}