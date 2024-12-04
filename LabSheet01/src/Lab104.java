import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Lab104 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 final double wage = 7.5;
	        final double tax = 0.15;
	        DecimalFormat frm = new DecimalFormat("###.0");
	        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
	       String name = JOptionPane.showInputDialog(null , "Enter employee name","Input",JOptionPane.QUESTION_MESSAGE);
	       
	       double workTime = Double.parseDouble(JOptionPane.showInputDialog(null , "Enter total hours for this employee.","Input",JOptionPane.QUESTION_MESSAGE));
	 
	       //calculate
	       double grossEarnings = workTime * 7.5;
	       double taxToPay = grossEarnings * 0.15;
	       double netEarnings = grossEarnings - taxToPay;
	 
	       //output
	       JOptionPane.showMessageDialog(null, "Employee name: "+name+"\nHours worked: "
	                                     +(frm.format(workTime))+"\nHourly wage: $ "+wage+ "\nGross earnings: $ "
	    		                         +frm.format(grossEarnings)+"\nTax rate: "+tax+"\nTax: $ "+frm.format(taxToPay)+"\nNet earnings: $ "
	                                     +frm.format(netEarnings));
	}

}
