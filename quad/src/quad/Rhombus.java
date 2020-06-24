package quad;

public class Rhombus extends Measurements {

	public Rhombus(float l, float b) {
		super(l, b);
		super.setArea( (l) *(b) / 2);
	}
	public String toString() {
		return "Rhombus \n Dialonal1: "+super.getL()+
			"\n Diagonal2: "+super.getB()+
			"\n Area: "+super.getArea();
	}

}
