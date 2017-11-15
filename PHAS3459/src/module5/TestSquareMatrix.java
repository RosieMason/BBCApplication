package module5;

public class TestSquareMatrix {


	public static void main(String[] args) {
		//initialise 4 matricies
		SquareMatrix A = new SquareMatrix();
		SquareMatrix B = new SquareMatrix();
		SquareMatrix C = new SquareMatrix();
		SquareMatrix D = new SquareMatrix();
		
		//try to set size and values for A
		try {
			A = new SquareMatrix(3, 3);
			A.matrix[0][0] = 1;
			A.matrix[0][1] = 2;
			A.matrix[0][2] = 0;
			A.matrix[1][0] = 0;
			A.matrix[1][1] = 2;
			A.matrix[1][2] = 0;
			A.matrix[2][0] = -2;
			A.matrix[2][1] = 0;
			A.matrix[2][2] = 1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//try to set size and values for B
		try {
			B = new SquareMatrix(3, 3);
			B.matrix[0][0] = 2;
			B.matrix[0][1] = 1;
			B.matrix[0][2] = 0;
			B.matrix[1][0] = 0;
			B.matrix[1][1] = 1;
			B.matrix[1][2] = 0;
			B.matrix[2][0] = -1;
			B.matrix[2][1] = 0;
			B.matrix[2][2] = 1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//try to set size and values for C
		try{
			C = new SquareMatrix(2, 2);
			C.matrix[0][0] = 4;
			C.matrix[0][1] = 3;
			C.matrix[1][0] = 3;
			C.matrix[1][1] = 2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//try to set size and values for D
		try {
			D = new SquareMatrix(2, 2);
			D.matrix[0][0] = -2;
			D.matrix[0][1] = 3;
			D.matrix[1][0] = 3;
			D.matrix[1][1] = -4;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Add A and B
		try {
			SquareMatrix add = SquareMatrix.addMatrix(A, B);
			System.out.println("The value of A + B is:");
			System.out.println(add);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Subtract A and B
		try {
			SquareMatrix minus = SquareMatrix.subtract(A, B);
			System.out.println("The value of A - B is:");
			System.out.println(minus);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Multiply AB
		try {
			SquareMatrix product = SquareMatrix.multiply(A, B);
			System.out.println("The value of AB is:");
			System.out.println(product);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Multiply BA
		try {
			SquareMatrix product = SquareMatrix.multiply(B, A);
			System.out.println("The value of BA is:");
			System.out.println(product);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Calculate the commutator [A,B]
		try {
			SquareMatrix AB = SquareMatrix.multiply(A, B);
			SquareMatrix BA = SquareMatrix.multiply(B, A);
			SquareMatrix commutor = SquareMatrix.subtract(AB, BA);
			System.out.println("The value of [A, B] is:");
			System.out.println(commutor);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Check if CD if a unit matric
		try {
			SquareMatrix cd = SquareMatrix.addMatrix(C, D);
			if(cd.equals(SquareMatrix.unitMatrix(2)) == true) {
				System.out.println("CD is the unit vector");
			}
			else {
				System.out.println("CD is not the unit vector");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("The above line should read 'CD is the unit vector' however I cannot get this to work.");

	}
}
		
		
		
		
			

		
		

