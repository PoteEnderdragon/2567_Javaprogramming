import javax.swing.JOptionPane;
public class Lab501_method {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0.0;
	static boolean validItem = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputItem();

	}
	
	public static void inputItem() 
	{
int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		for (int i =0 ; i<validValues.length;i++) {
			if (itemOrder == validValues[i]) {
				itemPrice = priceProduct[i];
				validItem = true;
			}
		}//end of for
		
		if(checkItem(itemOrder)) {
			System.out.print("Item "+itemOrder+" is "+itemPrice);
		}
		else {
			//System.out.print("Invalid Item");
			JOptionPane.showMessageDialog(null, "Invalid Item","Error " ,JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static boolean checkItem(int item) 
	{
		for (int i =0 ; i<validValues.length;i++) {
			if (item == validValues[i]) {
				itemPrice = priceProduct[i];
				validItem = true;
			}
		}//end of for
		return validItem;
	}

}
