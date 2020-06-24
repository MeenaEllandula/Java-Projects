package quad;

public class Rectangle extends Measurements {
 
	public Rectangle(float l, float b) {
		super(l, b);
		super.setArea(l*b);
	}

	
	public String toString() {
		return "Rectangle \n Length: "+super.getL()+
				"\n Breadth: "+super.getB()+
				"\n Area: "+super.getArea();
	}
	

	
}
