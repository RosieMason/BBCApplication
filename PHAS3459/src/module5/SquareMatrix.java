package module5;

//import java.util.Arrays;

public class SquareMatrix {
	
	double[][] matrix;
	static int i = 0;
	static int j = 0;
	
	public SquareMatrix() {}
	
	public SquareMatrix(int a, int b) {//throws Exception {
//		if(a != b) {
//			throw new Exception("The matrix is not a Square Matrix");
//		}
		matrix = new double[a][b];
	}

	
	public String toString() {
		int i = 0;
		int j = 0;
		String str="";
		for (i = 0; i < matrix.length; i++) {
		    for (j = 0; j < matrix[i].length; j++) {
		        str += " " + matrix[i][j] + " ";
		    }
		    str += "\r\n";
		}
		return str;
	}
	
	public static SquareMatrix unitMatrix(int size) throws Exception {
		SquareMatrix unit = new SquareMatrix(size, size);
		for (i = 0; i < unit.matrix.length; i++) {
		    for (j = 0; j < unit.matrix[i].length; j++) {
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
	
	
	public boolean equals(Object obj) {
		boolean x = true;
		SquareMatrix other = (SquareMatrix) obj;
		while(x= true) {
			for (i = 0; i < other.matrix.length; i++) {
				for (j = 0; j < other.matrix[i].length; j++) {
					if(this.matrix[i][j] == other.matrix[i][j]) {
						x = true;
					}
					else {
						x = false;
					}
				}
			}
			break;
		}
		return x;
	}
		
	 
	
	public static SquareMatrix addMatrix(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix add = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		for(i=0; i<sm1.matrix.length ; i++) {
			for(j = 0 ; j < sm1.matrix[i].length ; j++) {
				add.matrix[i][j] = sm1.matrix[i][j] + sm2.matrix[i][j];
			}
		}
		return add;
	}
	
	public static SquareMatrix subtract(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix minus = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		for(i = 0 ; i < sm1.matrix.length ; i++) {
			for(j = 0 ; j < sm1.matrix[i].length ; j++) {
				minus.matrix[i][j] = sm1.matrix[i][j] - sm2.matrix[i][j];
			}
		}
		return minus;
	}
	
	public static SquareMatrix multiply(SquareMatrix sm1, SquareMatrix sm2) throws Exception{
		if(sm1.matrix.length != sm2.matrix.length || sm1.matrix[1].length != sm2.matrix[1].length) {
			throw new Exception("sm1 and sm2 are not the same size.");
		}
		SquareMatrix multiply = new SquareMatrix(sm1.matrix.length, sm2.matrix.length );
		int x = 0;
		for(i = 0; i<sm1.matrix.length ; i++) {
			for(j = 0 ; j <  sm1.matrix[i].length ; j++) {
				for ( x= 0 ; x < sm1.matrix.length ; x++) {
					double a = sm1.matrix[i][x] * sm2.matrix[x][j];
					multiply.matrix[i][j] = (int) (multiply.matrix[i][j] + a);
				}
			}
		}
		return multiply;
	}
	
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

