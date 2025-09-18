import java.util.*;

public class FindDuplicateInString{
	
	static void duplicate(String str) {
    if (str == null || str.length() <= 1) {
        return;
    } else {
        char ch = str.charAt(0);
        String remaing = str.substring(1);
        
        if (remaing.contains(String.valueOf(ch))) {
            System.out.print(ch + " ");
        }
        duplicate(remaing);
    }
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String num = sc.next();
		
		duplicate(num);

	}
}