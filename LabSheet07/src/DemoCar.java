
public class DemoCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Chevrolet","Cruze",2009,150000.0);
		
		System.out.println("Company Name: " + car1.getCompanyName() + "\nModel name " + car1.getModelName()
		                   + "\nYear: " + car1.getYear() + "\nMileage: " + car1.getMileage());
		
		System.out.println();
		
		System.out.println("Updated Car Details:");
		Car car2 = new Car("Toyota","Corolla",2015,100000.0);
		System.out.println(car2);
				
		car1.setYear(1800);
		car1.setCompanyName(null);
		car1.setModelName(null);

	}

}
