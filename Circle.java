
public class Circle implements Shape{

	double radius =3;
	
	
	@Override
	public double calculateArea() {		
		return (radius * radius) * Math.PI;
	}
	
	@Override
	public void display() {
		System.out.println("This is a circle");
	}
	
}