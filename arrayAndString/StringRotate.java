package arrayAndString;

import java.util.*;

public class StringRotate {

	public static boolean isStringRotated(String s1, String s2) {
		if(s1.length() == s2.length()) {
			//Logic: If 1st word is in the form XY and 2nd word is in the form YX. Then XYXY contains YX
			String s1s1 = s1 + s1;  
			
			return s1s1.contains(s2); //Checks if s1s1 contains s2
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.print(	isStringRotated(str1, str2));
		
		sc.close();

	}

}
