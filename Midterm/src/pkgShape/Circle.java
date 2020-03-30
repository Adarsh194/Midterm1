package pkgShape;

public class Circle extends Shape implements Comparable {
	
	private double Radius;
	
	public Circle(double Radius) throws IllegalArgumentException {
		super();
		this.Radius=Radius;
		if (Radius<=0) {
				throw new IllegalArgumentException("Radius must be greater than zero");
			}
	}
	
	public double area() {
		double Area=0;
		Area=Math.PI*Radius*Radius;
		return Area;
	}
	protected double getRadius() {
		return Radius;
	}
	protected void setRadius(double radius) throws IllegalArgumentException {
		Radius=radius;
		if (Radius<=0) {
			throw new IllegalArgumentException("Radius must be greater than zero");
		}
	}
	public int compareTo(Object o) {
		int ComparisonValue=0;
		Circle f= (Circle) o;
		if (this.area() < f.area()) {
			ComparisonValue=-1;
		}
		else if (this.area() > f.area()) {
			ComparisonValue=1;
		}
		return ComparisonValue;
	}
}
