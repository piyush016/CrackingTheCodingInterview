package arrayAndString;

public class URLify {
	static  void replaceSpace(char arr[], int trueLength) {
		int whiteSpace = 0, i=0;
		
		for( i=0; i<trueLength; i++) {
			if(arr[i] == ' ')
				whiteSpace++;
		}	
			int index = trueLength + 2*whiteSpace;
			
			if (trueLength < arr.length) 
				arr[trueLength] = '\0';
			
			for(i=trueLength-1; i>=0; i--) {
				if(arr[i] == ' ') {
					arr[index-1] = '0';
					arr[index-2] = '2';
					arr[index-3] = '%';
					
					index = index - 3;
				}
				else {
					arr[index] = arr[i];
					index--;
				}
			}
			
			System.out.print(arr);
	
	}

	public static void main(String[] args) {


		String str = "My name is Piyush";
		char arr []= str.toCharArray();
		
		int len = str.length();

		replaceSpace(arr, len);
		
	}

}
