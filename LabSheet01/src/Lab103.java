import javax.swing.JOptionPane;
public class Lab103 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	       final double hourToPay = 50;
	       final double minutesToPay = 0.25;
	 
	       int ParkingTimeInMinutes = Integer.parseInt(JOptionPane.showInputDialog(null,"Input Time Parking (minutes):","Input",JOptionPane.QUESTION_MESSAGE));
	 
	       //Calculate
	       int hour = ParkingTimeInMinutes / 60;
	       int minutes = ParkingTimeInMinutes - (hour * 60);
	       double ParkingPay = (hour *  hourToPay) + (minutes * minutesToPay);
	 
	       //ShowMessage
	       JOptionPane.showMessageDialog(null,"You parking " +hour+ " Hour " +minutes+ " Minute. " + "\nAmount to be paid is " +ParkingPay+ " baht.");
 
	}

}
