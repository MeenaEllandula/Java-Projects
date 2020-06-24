package quad;

public class Measurements {

	float l;
	float b;
	float a;
	float area;
	
	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public Measurements(float a) {
	
		this.a = a;
	}

	public Measurements(float l, float b) {
		
		this.l = l;
		this.b = b;
	}
	
	
}
