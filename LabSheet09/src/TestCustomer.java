
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 // Customer's toString()
		 System.out.println(c1);
		 // set customer's discount is 5
		 c1.setDiscount(5);
		 // Customer's toString()
		 System.out.println(c1);

		 Line();
		 // show customer's id
		 System.out.println("id is: "+ c1.getId());
		 // show customer's name
		 System.out.println("name is: "+ c1.getName());
		 // show customer's discount
		 System.out.println("discount is: "+ c1.getDiscount());
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 // Invoice's toString()
		 System.out.println(inv1);
		 inv1.setAmount(10000);
		 System.out.println(inv1);

		 Line();
		 // show invoice's id
		 System.out.println("invoice id is: "+ inv1.getId());
		 System.out.println("customer is: "+ c1);
		 System.out.println("amount is: "+ inv1.getAmount());
		 Line();
		 System.out.println("customer's id is: "+ inv1.getCustomerId());
		 // show customer's name
		 System.out.println("customer's name is: "+ inv1.getCustomerName());
		 // show customer's discount
		 System.out.println("customer's discount is: "+ inv1.getCustomerDiscount());
		 System.out.printf("amount after discount is: %.2f"+ inv1.getAmountAfterDiscount());
		 
		 } //end of main method()
		 public static void Line() {
			 for (int i = 1;i<=50;i++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }


	}


