package memorias_array_listas;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("set the size of the matrix :");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0 ; i < n ;i++) {
			System.out.printf("%dº coluna :%n",(i+1));
			for(int j = 0; j < n ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Main diagonal:");
		for(int i = 0 ; i < n;i++) {
			System.out.printf("%d ",matrix[i][i]);
		}
		
		int count = 0;
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0; j < n ; j++) {
				if(matrix[i][j] < 0) {
					count+=1;
				}
			}
		}
		
		System.out.printf("%nNegative numbers = %d",count);
		sc.close();
	}

}
