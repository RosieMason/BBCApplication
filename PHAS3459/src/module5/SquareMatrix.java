package module5;


public class SquareMatrix {
	
	//initialise variables
	double[][] matrix;
	static int i = 0;
	static int j = 0;
	
	public SquareMatrix() {}
	
	//set size of square matrix - throws exception if not a square matrix
	public SquareMatrix(int a, int b) throws Exception {
		//throw exception if not a square matrix
		if(a != b) {
			throw new Exception("The matrix is not a Square Matrix");
		}
		matrix = new double[a][b];
	}

	//set how to output matricies
	public String toString() {
		int i = 0;
		int j = 0;
		String str="";
		//print for combinations of i and j
		for (i = 0; i < matrix.length; i++) {
		    for (j = 0; j < matrix[i].length; j++) {
		        str += " " + matrix[i][j] + " ";
		    }
		    str += "\r\n";
		}
		return str;
	}
	
	//create a unit matrix for specified size - throws exception if no size entered
	public static SquareMatrix unitMatrix(int size) throws Exception {
		SquareMatrix unit = new SquareMatrix(size, size);
		//go through all combinations of i and j
		for (i = 0; i < unit.matrix.length; i++) {
		    for (j = 0; j < unit.matrix[i].length; j++) {
		    	//set 1 on the diagonal, 0 elsewhere
		    	if (j==i) {
		    		unit.matrix[i][j] = 1;
		    	}
		    	else {
		    		unit.matrix[i][j] = 0;
		    	}
		    }
		}
		return unit;
	}
	
	//check if two matricies are equal
	public boolean equals(Object obj) {
		boolean x = true;
		SquareMatrix other = (SquareMatrix) obj;
		//run loop while x is true
		while(x= true) {
			//run through all combinations of i and j
			for (i = 0; i < other.matrix.length; i++) {
				for (j = 0; j < other.matrix[i].length; j++) {
					//return true if elements are equal, false otherwise
					if(this.matrix[i][j] == other.matrix[i][j]) {
						x = true;
					}
					else {
						x = false;
					}
				}
			}
			//break the loop
			break;
		}
		return x;
	}
		
	 
	//static method to add to matricies - throws exception if they are different sizes
	//each element ij is added
	public static SquareMatrix addMatrix(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		//throws exception if the length of the rows or columns are not equal
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix add = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		//run through for all combinations of i and j
		for(i=0; i<sm1.matrix.length ; i++) {
			for(j = 0 ; j < sm1.matrix[i].length ; j++) {
				add.matrix[i][j] = sm1.matrix[i][j] + sm2.matrix[i][j];
			}
		}
		return add;
	}
	
	//static method to subtract matricies - throws exception if they are different sizes
	//each element ij is subtracted 
	public static SquareMatrix subtract(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		//throws exception if the length of the rows or columns are not equal
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix minus = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		//run through all combinations of i and j
		for(i = 0 ; i < sm1.matrix.length ; i++) {
			for(j = 0 ; j < sm1.matrix[i].length ; j++) {
				minus.matrix[i][j] = sm1.matrix[i][j] - sm2.matrix[i][j];
			}
		}
		return minus;
	}
	
	//static method to multiply two matricies - throws exception if they are different sizes
	//Pij = Aix Bxj, Pij is summed over x
	public static SquareMatrix multiply(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		//throws exception if the length of the rows or columns are not equal
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix multiply = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		int x = 0;
		//run through all combinations of i and j
		for(i = 0; i<sm1.matrix.length ; i++) {
			for(j = 0 ; j <  sm1.matrix[i].length ; j++) {
				//increase x for each combination of i and j
				for ( x= 0 ; x < sm1.matrix.length ; x++) {
					double a = sm1.matrix[i][x] * sm2.matrix[x][j];
					multiply.matrix[i][j] = (int) (multiply.matrix[i][j] + a);
				}
			}
		}
		return multiply;
	}
	
	//non static method to add matricies using the static method
	public SquareMatrix addMatrix(SquareMatrix sm1) {
		SquareMatrix add = new SquareMatrix() ;
		try {
			add = addMatrix(sm1, this);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return add;
	}
	
	//non static method to subtract matricies using the static method
	public SquareMatrix subrtact(SquareMatrix sm1) {
		SquareMatrix minus = new SquareMatrix() ;
		try {
			minus = subtract(this, sm1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return minus;
	}
	
	//non static method to multiply matricies using the static method
	public SquareMatrix multiply(SquareMatrix sm1) {
		SquareMatrix product = new SquareMatrix() ;
		try {
			product = multiply(this, sm1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return product;
	}
	

}

