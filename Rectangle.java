
public class Rectangle implements Shape{

	double width = 3;
	double height = 2;
	
	@Override
	public double calculateArea() {		
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("This is  a rectangle");
		
	}

	
}