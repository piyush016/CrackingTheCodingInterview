package arrayAndString;
import java.util.*;

public class StringBuild {
	
	static String joinWords(String[] words) {
		//String sentence = "";
		StringBuilder sentence = new StringBuilder();
		
		for(String w : words) {   //For string w in words -> Print sentence + w
			//sentence = sentence  + w + " ";  Takes O(n^2) time complexity
			sentence.append(w);
			sentence.append(" ");			
		}
		//return sentence
		return sentence.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of strings: ");
		int num = sc.nextInt();
		
		String a[] = new String[num];
		
		System.out.println("Enter the string: ");
		for(int i=0; i<num; i++) {
			a[i] = sc.next();
		}
		
		System.out.println("Array of string in form of sentence : ");
		System.out.print(joinWords(a));
		
		sc.close();
	}
}
