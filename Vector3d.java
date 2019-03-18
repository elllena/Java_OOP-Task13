package main;

public class Vector3d {
	private int x;
	private int y;
	private int z;

	public Vector3d(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Vector3d summaOfVectors(Vector3d vector) {
		Vector3d newVector = new Vector3d(vector.x + x, vector.y + y, vector.z + z);
		return newVector;
	}

	public Vector3d scalarOfVectors(Vector3d vector) {
		Vector3d newVector = new Vector3d(vector.x * x, vector.y * y, vector.z * z);
		return newVector;
	}

	public Vector3d vectorOfVectors(Vector3d vector) {
		Vector3d newVector = new Vector3d(y * vector.z - z * vector.y, z * vector.x - x * vector.z,
				x * vector.y - y * vector.x);
		return newVector;
	}

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
