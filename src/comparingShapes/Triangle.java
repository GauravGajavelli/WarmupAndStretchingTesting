package comparingShapes;

/**
 * An implement of triangles with area and perimeter.
 * 
 * @author boutell. Created Dec 1, 2013.
 */
public class Triangle {
	private double a, b, c; // 3 sides

	/**
	 * Creates a triangle with the given sides.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * 
	 */
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	/**
	 * @return The area of this triangle.
	 */
	public double area() {
		// TODO: Implement this. Hint: lookup and use Heron's formula. 
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");

	}

	/**
	 * @return The perimeter of this triangle.
	 */
	public double perimeter() {
		return this.a + this.b + this.c;
	}

	@Override
	public String toString() {
		return String.format("Triangle with a=%.2f,b=%.2f,c=%.2f", this.a,
				this.b, this.c);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Triangle)) {
			return false;
		}
		Triangle other = (Triangle)obj;
		// CONSIDER: not very robust, but works for testing purposes. 
		return this.a == other.a && this.b == other.b && this.c == other.c;
	}

	/**k4FGqei}yKQ[gKzYfOAaO1DQT4X.G,ZW{Q-P2YFh{9w_?bR4eBO} 726.p3_Q?Av
	R4w3R11wW.31{Tu4:.(ut9ntIHhWG; FUfG4F[hU{0R9=E?2 -l*7E+E ?_uvOB
	FXsIv1MK9S3DunM-D!jS,3EX(3/H,cr)ovhGoR6Ja)[8oLIgQWCT+Lz9u)D6_r 
	evd:Qnm*/

}
