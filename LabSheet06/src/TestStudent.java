
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		student1.setStudentDetails("Siriyakorn", new double[] {65.0,70.0,75.0});
		student2.setStudentDetails("Sumsoo", new double[] {65.0,70.0});
		
		System.out.println("Student 1 details:");
		student1.displayStudentDetails();
		System.out.println("\nStudent 2 details:");
		student2.displayStudentDetails();

	}

}
