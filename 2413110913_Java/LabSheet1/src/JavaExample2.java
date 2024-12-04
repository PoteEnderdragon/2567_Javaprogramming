import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String productName  = JOptionPane.showInputDialog("Input product name: "); 
    String strProductUnit = JOptionPane.showInputDialog("Input Product Unit:");
    int productUnit = Integer.parseInt(strProductUnit);
    
    double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+ "Input Price per Unit:"));
    
    double totalPriceofProduct = productUnit * productPrice;
    double totalwithVat = totalPriceofProduct *1.07;
    String frmTotalPriceofProduct = String.format("%,.2f",totalPriceofProduct);
    String frmtotalwithVat = String.format("%.2f", totalwithVat);
    JOptionPane.showMessageDialog(null, "Total Price is "+frmTotalPriceofProduct+" baht."+"\nAdd VAT7% is "+frmtotalwithVat+ " baht."
    		);
    
    
	}

}
