package arrayAndString;

import java.util.Scanner;

public class CheckPermutation {

	static boolean checkPermut(String s1, String s2) { 
		int table[] = new int[26];
		
		if(s1.length() != s2.length())
			return false;
		
		for(int i=0; i<s1.length(); i++) {
			int index = s1.charAt(i) - 'a';	
			table[index]++;
		}
		
		for(int i=0; i<s2.length(); i++) {
			int index = s2.charAt(i) - 'a';
			table[index]--;
		}
		
		for(int i=0; i< 26; i++) {
			if(table[i] != 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		if (checkPermut(s1, s2))
			System.out.print("String 1 is permutaion of String 2");
		else
			System.out.print("String 2 is not permutation of String 2");
		
		sc.close();

	}
}