
public class TestResizeableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeableCircle rc1 = new ResizeableCircle(10.0);
		System.out.println(rc1);
		String format = String.format("%.2f", rc1.getPerimeter());
		
		System.out.println("Perimeter: "+format);
		System.out.printf("Area: %.2f",rc1.getArea());
		System.out.println();
		Line();
		
		rc1.resize(50);
		
		System.out.println("After resize(50%): "+rc1);
		System.out.println("Perimeter: "+rc1.getPerimeter());
		System.out.printf("Area: %.2f",rc1.getArea());

	}
	public static void Line() {
		for(int i=1; i<50;i++)
			System.out.print("*");
		System.out.println();
	}

}
