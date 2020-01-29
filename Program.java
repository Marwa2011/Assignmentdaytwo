
public class Program {

	public static void main(String[] args) {
	
		Array();
		
		interfacePractice();
		
	}	
	
	public static void Array() {
		int[][] array = {{2, 3, 7,},
						 {13, 15, 2},
						 {14, 3, 8}};
		
		int maxNum = 0;
		String position = "";
		
		for(int y = 0; y < array.length; y++) {
			for(int x = 0; x < array[0].length; x++) {
				if(array[x][y] > maxNum) {
					maxNum = array[x][y];
					position = x + ":" + y;
				}
			}
		}
		
		System.out.println("Max number is " + maxNum);
		System.out.println("The position is " + position);			
	}
	
	public static void interfacePractice() {
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		cir.display();
		System.out.println("The area is " + cir.calculateArea());
		
		((Shape) rect).display();
		System.out.println("The area is " + ((Shape) rect).calculateArea());
		
		tri.display();
		System.out.println("The area is " + tri.calculateArea());
		
	}
	
	
}
	
