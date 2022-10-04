package arrayAndString;

import java.util.*;

public class CompressedString {
	
	public static String compress(String str) {
		StringBuilder com= new StringBuilder();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			count++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1) )
			{
				com.append(str.charAt(i));
				com.append(count);
				count = 0;
			}	
		}
		
		if(str.length() <=com.length())
			return str;
		
		return com.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(compress(str));
		
		sc.close();
		

	}

}
