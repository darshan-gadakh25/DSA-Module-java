import java.util.*;

public class FindUniqueInString{
	
static char firstUnique(String str) {
    if (str == null || str.length() == 0) {
        return '\0'; // No unique character
    }

    char ch = str.charAt(0);
    String remaining = str.substring(1);

   
    if (!remaining.contains(String.valueOf(ch)) && 
        str.indexOf(ch) == str.lastIndexOf(ch)) {
        return ch;
    }

    return firstUnique(remaining);
}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String num = sc.next();
		
		char dup = firstUnique(num);
    if (dup != '\0') {
        System.out.println("First duplicate: " + dup);
    } else {
        System.out.println("No duplicates found.");
    }

	}
}