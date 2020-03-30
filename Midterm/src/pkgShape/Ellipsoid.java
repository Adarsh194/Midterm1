package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable{
	private double HeightRadius;
	
	public Ellipsoid(double Radius,double MinorRadius, double HeightRadius) throws IllegalArgumentException {
		super(Radius,MinorRadius);
		this.HeightRadius=HeightRadius;
		if (HeightRadius <=0) {
				throw new IllegalArgumentException("The Height should be greater than zero");
			}
	}
	public double volume() {
		double volume=0;
		volume=this.area()*this.HeightRadius*4/3;
		return volume;
	}
	public int compareTo(Object o) {
		int ComparisonValue=0;
		Ellipsoid f= (Ellipsoid) o;
		if (this.area() < f.area()) {
			ComparisonValue=-1;
		}
		else if (this.area() > f.area()) {
			ComparisonValue=1;
		}
		return ComparisonValue;
	}
}
