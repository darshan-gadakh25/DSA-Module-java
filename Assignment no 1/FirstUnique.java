import java.util.*;

public class FirstUnique{
	
	static char unique(String s){
	
		for(int i=0;i<s.length();i++){
			boolean dublicate= false;
			for(int j=i;j<s.length();j++){
				if(s.charAt(i) != s.charAt(j)){
					dublicate =true;
					break;
				}
			}
			if(!dublicate){
				return s.charAt(i);
			}
		}
		return null;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		String num = sc.next();
		
		System.out.println("non repetive charactre: "+unique(num));

	}
}