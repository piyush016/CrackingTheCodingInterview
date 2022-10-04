package arrayAndString;

import java.util.Scanner;

public class OneAway {
	public static boolean isOneAway(String str1, String str2) {
		int arr[] = new int[26];
		
		for(int i=0; i<str1.length(); i++)
			arr[str1.charAt(i) - 'a']++;
		for(int i=0; i<str2.length(); i++)
			arr[str2.charAt(i) - 'a']--;
		
		int countOdd = 0;
		
		 //Replace case
		if(str1.length() == str2.length()) {
			for(int i: arr) {
				if(i % 2 != 0)
					countOdd++;
			}		
			if(countOdd == 2)
				return true;
			else 
				return false;
		}
		
		//Insert or Remove case
		for(int i: arr) {
			if(i %2 != 0)
				countOdd++;
		}
		if(countOdd == 1)
			return true;
		
		return false;
		
	}

	public static void main(String[] args) {

		String str1, str2;
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
		System.out.print(isOneAway(str1, str2));
		sc.close();

	}

}
