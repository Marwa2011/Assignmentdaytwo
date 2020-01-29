
public class Triangle implements Shape {

	double base = 2;
	double height = 7;
	
	@Override
	public double calculateArea() {
		double area = (base * height) / 2;
		return area;
	}

	@Override
	public void display() {
		System.out.println("This is a  triangle");
		
	}

	
}
