
public class ShapeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = ShapeFactory1.getInstance("Square");
	}

}

class ShapeFactory1{
	
	public static Shape getInstance(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Shape{
	void draw();
}