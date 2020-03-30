package pkgShape;

public class Ellipse extends Circle implements Comparable {
	private double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) throws IllegalArgumentException{
		super(Radius);
		this.MinorRadius=MinorRadius;
		if (MinorRadius <=0) {
			throw new IllegalArgumentException("Minor Radius must be greater than zero");
			}
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}
	protected void serMinorRadius(double minorRadius) throws IllegalArgumentException {
		MinorRadius=minorRadius;
		if (MinorRadius < 0 ) {
			throw new IllegalArgumentException("Minor Radius must be greater than zero");
		}
	}
	
	@Override
	public double area() {
		double area=0;
		area= Math.PI*this.MinorRadius*this.getRadius();
		return area;
	}
	
	public boolean isCircle() {
		if (MinorRadius==this.getRadius()) {
			return true;
		}
		else {
			return false;
		}
	}

	public int compareTo(Object o) {
		int ComparisonValue=0;
		Ellipse f= (Ellipse) o;
		if (this.area() < f.area()) {
			ComparisonValue=-1;
		}
		else if (this.area() > f.area()) {
			ComparisonValue=1;
		}
		return ComparisonValue;
	}
}
