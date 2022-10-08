package Lucky;

public class Circle {
	int radius;
	String color;
	Circle() {
		radius=20;
		color="red";
		
         
	}
	Circle (int r){
		radius = r;
		radius=r;
	}
	int getRadius() {
		return 20;
	}
	String getColor() {
		return "red";
		
		
	}
	int getArea() {
		return radius*radius;
	}
	public static void main(String args[]) {
		Circle c=new Circle();
		
		//Circle c1=new Circle();
		
		System.out.println("radius "+c.getRadius());
		
		System.out.println("Area "+c.getArea());
		
		System.out.println("color "+c.getColor());
	}
}
	

