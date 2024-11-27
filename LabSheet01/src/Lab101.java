import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
        System.out.print("Input Product Name   : ");
        String productName = input.nextLine();
        System.out.print("Input Product Unit   : ");
	    int productUnit = input.nextInt();
	    System.out.print("Input Price per unit : ");
	    float productPrice = input.nextFloat();
	    float totalPriceofProduct = productUnit * productPrice;
	    
	    System.out.println("---------------------------");
	    System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" bath.");
	    System.out.println("---------------------------");
	    
	    System.out.print("How many discount (%0) : ");
	    int discountofProduct = input.nextInt();
	    System.out.println("---------------------------");
	    
	    float totalwithVat = (totalPriceofProduct * discountofProduct/100);
	    System.out.println("Discount from "+ discountofProduct +"%  "+frm.format(totalwithVat)+" baht.");
	    
	    float TotalPrice = totalPriceofProduct - totalwithVat;
	    System.out.println("Amount to be paid  "+ frm.format(TotalPrice) +" baht.");
	}

}
