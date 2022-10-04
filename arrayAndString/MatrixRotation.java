package arrayAndString;

import java.util.Scanner;

public class MatrixRotation {
	
	public static void rotate(int arr[][]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length-1-j];
				arr[i][arr.length-1-j] = temp;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
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
		
		rotate(arr);
		sc.close();
	}

}
