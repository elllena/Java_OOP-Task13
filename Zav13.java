package main;

public class Zav13 {

	public static void main(String[] args) {
		Vector3d vectorOne = new Vector3d(3, -4, 1);
		Vector3d vectorTwo = new Vector3d(5, 4, -7);
		
		System.out.println("The first vector: "+vectorOne);
		System.out.println("The second vector: "+vectorTwo);
		System.out.println();
		System.out.println("Sum of vectors: "+vectorOne.summaOfVectors(vectorTwo));
		System.out.println("Scalar multiplication of vectors: "+vectorOne.scalarOfVectors(vectorTwo));
		System.out.println("Vector multiplication of vectors: "+ vectorOne.vectorOfVectors(vectorTwo));

	}

}
