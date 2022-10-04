package arrayAndString;

import java.util.*;

public class IsUnique {
	
	static boolean FIndIsUnique(String str) {
	
		int ans[] = new int[26];
		 
		 for(int i=0; i<str.length(); i++) {
			 
			 int index = str.charAt(i) - 'a';
			 ans[index]++ ;
			 
			 if(ans[index] > 1) //value of that index increases by 1
				 return false; 
			 
		 }
	 
		 return true; //All characters are unique
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(	FIndIsUnique(str))
			System.out.print("All characters are unique");
		else 
			System.out.print("All characters are not unique");
		
		sc.close();
	}

}
