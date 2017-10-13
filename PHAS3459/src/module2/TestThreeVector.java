package module2;

public class TestThreeVector {

	public static void main(String[] args) {
		ThreeVector v1 = new ThreeVector(3, 5, 2);
		ThreeVector v2 = new ThreeVector(2, 4, 1);
		ThreeVector v3 = new ThreeVector(0, 0, 0);
		
		System.out.println("The vector v1 is "+v1+"its unit vector is "+v1.unitVector());
		System.out.println("The vector v2 is "+v2+"its unit vector is "+v2.unitVector());
		System.out.println("The vector v3 is "+v3+"its unit vector is "+v3.unitVector());
				
		System.out.println("The scalar product of v1 and v2 using a non-static method is "+ v1.scalarProduct(v2));
		System.out.println("The scalar product of v1 and v2 using a static method is "+ ThreeVector.scalarProduct(v1, v2));
		System.out.println("The scalar product of v1 and v3 using a non-static method is "+ v1.scalarProduct(v3));
		System.out.println("The scalar product of v1 and v3 using a static method is "+ ThreeVector.scalarProduct(v1, v3));
		System.out.println("The vector product of v1 and v2 using a non-static method is "+ v1.vectorProduct(v2));
		System.out.println("The vector product of v1 and v2 using a static method is "+ ThreeVector.vectorProduct(v1, v2));
		System.out.println("The vector product of v1 and v3 using a non-static method is "+ v1.scalarProduct(v3));
		System.out.println("The vector product of v1 and v3 using a static method is "+ ThreeVector.scalarProduct(v1, v3));
		
		System.out.println("The angle between v1 and v2 calculated using a non-static method is " + v1.angle(v2));
		System.out.println("The angle between v1 and v2 calculated using a static method is " + ThreeVector.angle(v1, v2));
		System.out.println("The angle between v1 and v3 calculated using a non-static method is " + v1.angle(v3));
		System.out.println("The angle between v1 and v2 calculated using a static method is " + ThreeVector.angle(v1, v3));
		
		//testing without a toString
		//System.out.println(v1);
		System.out.println("When trying to print without a toString module2.ThreeVector@15db9742 is returned");
		
		
		
		

	}

}
