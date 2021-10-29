package AssignmentTwo_Five;

public class ShapeDemo {

	public static void main(String[] args) {
		 
		Shape line = new Line();
		Shape rectangle = new Rectangme();
		Shape cube = new Cube();
		
		line.draw();
		rectangle.draw();
		cube.draw();
	}

}

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{

	@Override
	void draw() {
		 System.out.println("Line");
	}
	
}
class Rectangme extends Shape{

	@Override
	void draw() {
		 System.out.println("Rectangle");
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		 System.out.println("Cube");
	}
	
}
