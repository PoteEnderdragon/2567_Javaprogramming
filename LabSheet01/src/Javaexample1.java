import java.util.*;
import java.text.*;
public class Javaexample1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	     DecimalFormat frm = new DecimalFormat("#,###.00");
	     
	     System.out.print("input product name: ");
	     String productName = input.nextLine();
	     //receive productinfo
	     System.out.print("Input product unit: ");
	     int productUnit = input.nextInt();
	     System.out.print("Input price per unit: ");
	     float productPrice = input.nextFloat();
	     System.out.println();
	     
	     float totalPriceofProduct = productUnit * productPrice;
	     System.out.println("Total Price is "+frm.format(totalPriceofProduct)+"bath.");
	     
	     
	     float totalwithVat = totalPriceofProduct + (totalPriceofProduct * 7/100);
	     System.out.println("Add Vat 7% is "+frm.format(totalwithVat) +" baht.");
	     System.out.println();
	     
	     String frmtotalwithVat = String.format("%.wf",totalwithVat);
	     System.out.println("Output using String.format");
	     System.out.printf("Add VAT 7% is "+frmtotalwithVat +" baht. ");
	     System.out.println();
	     System.out.println("Output using printf");
	     System.out.printf("Add VAT 7% is %,.2f ", totalwithVat);
	     
	     
	     
	     
	     
	     
	     
	    input.close();
	}

}
