package karthika2;

public class Square extends Rectangle {
	public Square(String color, int side) {
		super(color, side, side);	
	}
	
	@Override
	public double calculateArea()
	{
		System.out.println("Calculate area in square is called");
		return this.side*this.side;
	}
	
	@Override
	public void draw() {
		System.out.println("This is a " +super.color+ " " + "square");
	}

}
