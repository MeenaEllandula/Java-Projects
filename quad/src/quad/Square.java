package quad;

public class Square extends Measurements{

	public Square(float a) {
		super(a);
		super.setArea(this.area(a));
	}
	public float area(float a) {
		float area = a * a;
		return area;
		}
	
	public String toString() {
		return "Square \n Side: "+super.getA()+
				"\n Area: "+super.getArea();
	}

}
