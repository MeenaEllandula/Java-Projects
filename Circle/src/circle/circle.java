package circle;

public class circle {
 
	float radius ;
	final static float PI=3.14f;
	
	public circle(float radius) {
		super();
		this.radius = radius;
	}

	public void area(){
		float a = PI  * radius * radius;
		System.out.println("Area : "+a);
		}
}
