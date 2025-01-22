
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		System.out.println("Display data using toSting() method");
		System.out.println(r1);
		space();
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		space();
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("length is " + r1.getLength());
		System.out.println("width is " + r1.getWidth());
		
		space();
		System.out.printf("area is %.2f%n",r1.getArea());
		System.out.printf("parimeter is %.2f%n",r1.getPerimeter());
		
		System.out.printf("area is %.2f%n",r2.getArea());
		System.out.printf("parimeter is %.2f",r2.getPerimeter());

	}
	
	public static void space() {
		System.out.println();
	}

}
