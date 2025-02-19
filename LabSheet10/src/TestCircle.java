
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		System.out.println(c1);
		c1.getPerimeter();
		c1.getArea();
		String format = String.format("%.2f", c1.getPerimeter());
		System.out.println("Perimeter: "+format);
		System.out.printf("Area: %.2f",c1.getArea());

	}

}
