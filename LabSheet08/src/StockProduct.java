import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		
		for (int i =0;i<productList.length;i++) 
		{
			productList[i] = new Product();
			System.out.print("Input product id : ");
			String id = scan.nextLine();
			productList[i].setId(id);
			System.out.print("Input product Unit : ");
			int unit = scan.nextInt();
			scan.nextLine();
			productList[i].setUnit(unit);
			System.out.print("Input product Price : ");
			double price = scan.nextDouble();
			scan.nextLine();
			productList[i].setPrice(price);
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		double totalPrice = 0;
		for(Product product:productList) {
			System.out.println("Product ID : "+product.getId()+"Total price = "+product.calculate()+" baht.");
			totalPrice += product.calculate();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Total price of all products is "+ totalPrice + " baht.");
		scan.close();

	}

}
