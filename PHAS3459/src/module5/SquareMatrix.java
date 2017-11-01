package module5;

import java.util.Arrays;

public class SquareMatrix {
	
	//int[][] matrix;
//	
//	public SquareMatrix( int a, int b) {
//		matrix = new int[a][b];
//	}
//	
//	public static int[][] addMatrix(int[][] a, int[][] b) {
//		int[][] c = new int[a.length][a[0].length];
//		int i = 0;
//		int j = 0;
//		for(i = 0 ; i < a.length ; i++) {
//			for(j = 0 ; j < a[i].length ; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		return c;
//	}
	
	

	public static void main(String[] args) {
		int[][] A = {{1, 2, 0}, {0, 2, 0}, {-2, 0, 1}};
		int[][] B = {{2, 1, 0}, {0, 1, 0}, {-1, 0, 1}};
		int[][] C = {{4, 3}, {3, 2}};
		int[][] D = {{-2, 3}, {3, -4}};
		
		
		int[][] ADD = new int[3][3];
		int i = 0;
		int j = 0;
		for(i = 0 ; i < A.length ; i++) {
			for(j = 0 ; j < A[i].length ; j++) {
				ADD[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("The value of A+B is:");
		for (i = 0; i < ADD.length; i++) {
		    for (j = 0; j < ADD[i].length; j++) {
		        System.out.print(ADD[i][j] + " ");
		    }
		    System.out.println();
		
		}	
		
		
		int[][] MINUS = new int[3][3];
		for(i = 0 ; i < A.length ; i++) {
			for(j = 0 ; j < A[i].length ; j++) {
				MINUS[i][j] = A[i][j] - B[i][j];
			}
		}
		
		
		System.out.println("The value of A-B is:");
		for (i = 0; i < MINUS.length; i++) {
		    for (j = 0; j < MINUS[i].length; j++) {
		        System.out.print(MINUS[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		int[][] AB = new int[3][3];
		int[][] BA = new int[3][3];
		int[][] COMMUTATOR = new int[3][3];
		for(i = 0; i<A.length ; i++) {
			for(j = 0 ; j <  A[i].length ; j++) {
				int x = 0;
				int a = A[i][x] * B[x][j];
				int b = A[i][x + 1] * B[x + 1][j];
				int c = A[i][x + 2] * B[x + 2][j];
				AB[i][j] = a + b + c;
			}
		}
		for(i = 0; i<A.length ; i++) {
			for(j = 0 ; j <  A[i].length ; j++) {
				int x = 0;
				int a = B[i][x] * A[x][j];
				int b = B[i][x + 1] * A[x + 1][j];
				int c = B[i][x + 2] * A[x + 2][j];
				BA[i][j] = a + b + c;
			}
		}
		for(i = 0 ; i < AB.length ; i++) {
			for(j = 0 ; j < AB[i].length ; j++) {
				COMMUTATOR[i][j] = AB[i][j] - BA[i][j];
			}
		}
		System.out.println("The value of the commutator [A, B] is:");
		for (i = 0; i < COMMUTATOR.length; i++) {
		    for (j = 0; j < COMMUTATOR[i].length; j++) {
		        System.out.print(COMMUTATOR[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		int[][] CD = new int[2][2];
		for(i = 0; i<C.length ; i++) {
			for(j = 0 ; j <  C[i].length ; j++) {
				int x = 0;
				int a = C[i][x] * D[x][j];
				int b = C[i][x + 1] * D[x + 1][j];
				CD[i][j] = a + b;
			}
		}
		System.out.println("The value of CD is:");
		for (i = 0; i < CD.length; i++) {
		    for (j = 0; j < CD[i].length; j++) {
		        System.out.print(CD[i][j] + " ");
		    }
		    System.out.println();
		}
		
		int[][] I = {{1, 0}, {0, 1}};
		
	}
}
