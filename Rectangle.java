package karthika2;

public class Rectangle implements IShape{
	int length, width;
	String color;
	
	Renderer renderer;

	public Rectangle(String color, int length, int width) {
		this.color = color;
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return this.length*this.width;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (this.width * this.length);
	}
	
	@Override
	public void draw() {
		System.out.println("This is a " +super.color+ " " + "rectangle");
		}
	

	@Override
	public void draw(String message) {
		System.out.println(message);
		}
	

}
