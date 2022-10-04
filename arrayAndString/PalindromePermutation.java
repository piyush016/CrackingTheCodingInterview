package arrayAndString;

public class PalindromePermutation {
	public static boolean isPermutationPalindrome(String str) {
		int arr[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ')
				continue;
			
			else 
				arr[str.charAt(i) - 'a']++;
		}
		
		int countOdd = 0;
		for(int i=0; i<26; i++) {
			if(arr[i] % 2 == 1)
				countOdd++;
			if(countOdd > 1)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str = "heellleeeh";
		System.out.println(isPermutationPalindrome(str));
	}

}
