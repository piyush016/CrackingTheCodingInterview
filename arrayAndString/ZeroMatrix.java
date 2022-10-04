package arrayAndString;

import java.util.Scanner;

public class ZeroMatrix {
	/*public static void ZeroBrute(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				//Making row and column -1 for that particular 0
				if(arr[i][j] == 0) {
					for(int k=0; k<arr.length; k++) {
						if(arr[k][j] != 0)
							arr[k][j] = -1;
					}
					for(int k=0; k<arr[0].length; k++) {
						if(arr[i][k] != 0)
							arr[i][k] = -1;
					}
				}
			}
		}
		
		//Making -1 as 0 wherever it is present
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j] == -1)
					arr[i][j] = 0;
			}
		}
		
		//Printing the matrix
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}*/
	
	public static void ZeroArr(int arr[][]) {
		boolean row[] = new boolean[arr.length];
		boolean col[] = new boolean[arr[0].length];
		
		for(int i=0; i<arr.length; i++)	{
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j] == 0) {	
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(row[i] == true || col[j] == true)
					arr[i][j] = 0;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//ZeroBrute(arr);
		ZeroArr(arr);
		sc.close();

	}

}
