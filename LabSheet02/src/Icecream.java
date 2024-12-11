
import javax.swing.JOptionPane;

public class Icecream {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//กำหนดตัวแปรคงที่
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
       
        String iceCream;
        int iceCreamPrice;
        int totalPrice;
        int toppingPrice;
 
        //Input      
        int choseFlavor = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."+"\n[2] Chocolate Flavor 15 B."+"\nPress number to choose flavor:","Input",JOptionPane.QUESTION_MESSAGE));
       
        while(choseFlavor <= 0 || choseFlavor >=3)
        {
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice!"+"\nTry again...", "ERROR", JOptionPane.ERROR_MESSAGE);
            choseFlavor = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."+"\n[2] Chocolate Flavor 15 B."+"\nPress number to choose flavor:","Input",JOptionPane.QUESTION_MESSAGE));
             
        }
       
        iceCream = (choseFlavor == 1) ? "Vanilla Flavor" : "Chocolate Flavor";
        iceCreamPrice = (choseFlavor == 1) ? VANILLA : CHOCOLATE;
        int getTopping = JOptionPane.showConfirmDialog(null,"Do you want to add topping?" ,"Topping", JOptionPane.YES_NO_OPTION);
        toppingPrice = (getTopping == 0) ? TOPPING : 0;
       
        String toppingMessage = (getTopping == JOptionPane.YES_OPTION) ? "with topping" : "no topping";
       
        //Calculate totalPrice
        totalPrice = iceCreamPrice + toppingPrice;
       
        //output      
        JOptionPane.showMessageDialog(null,"You choose "+iceCream+"\nAnd "+ toppingMessage + "\nTotal price = "+totalPrice+" baht." );

	}

}
