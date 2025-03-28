package memorias_array_listas;

import java.util.Scanner;

public class matrix_exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number of lines :");
		int l = sc.nextInt();
		System.out.print("enter the number of columns :");
		int c = sc.nextInt();

		int[][] matrix = new int[l][c];
		
		for(int i = 0 ; i < l ;i++) {
			System.out.printf("%dº coluna :%n",(i+1));
			for(int j = 0; j < c ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("--------------------------------");
		
		for(int i = 0 ; i < l ;i++) {
			System.out.println();
			for(int j = 0; j < c ; j++) {
				System.out.printf("%d ",matrix[i][j]);
			}
		}
		
		System.out.printf("%nEnter the number you want to search :");
		int search = sc.nextInt();
		
		for(int i = 0 ; i < l ;i++) {
			for(int j = 0; j < c ; j++) {
				 if(matrix[i][j] == search) {
					 System.out.println();
					 System.out.printf("Position %d : %d",i,j);
					 
					 if(j - 1 >= 0) {
						 System.out.printf("%nNumber Left : %d",matrix[i][j-1]);
					 }
					 if(j + 1 <= c-1) {
						 System.out.printf("%nNumber Right : %d",matrix[i][j+1]);
					 }
					 if(i - 1 >= 0) {
						 System.out.printf("%nNumber up : %d",matrix[i-1][j]);
					 }
					 if(i + 1 < l-1) {
						 System.out.printf("%nNumber down : %d",matrix[i+1][j]);
					 } 
				 }
			}
		}
		
		System.out.println();
		sc.close();

	}

}
