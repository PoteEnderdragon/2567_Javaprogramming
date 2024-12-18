import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		inputEmail();

	}//end of main method
	//Static = ไม่ต้องสร้าง obj มาเรียกใช้
	public static void inputEmail() 
	{
		String ans;
		String VarEmail;
		
		
		do {
			VarEmail = JOptionPane.showInputDialog("Input your email:");
			if(VarEmail != null && !VarEmail.isEmpty()) {
				checkEmailError(VarEmail);
			}
			else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]:");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}//End of inputEmail;
	
	//check VarEmail 
	public static void checkEmailError(String email) 
	{
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid email. Input your e-mail again:");
			
		};
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email) ? "Your e-mail is " + email 
						: "Your email is not a hotmail or gmail address");
	}//End of checkEmailError method
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) 
		{
			return true;
			//return (email.endsWith("@gmail.com")||email.endsWith("@hotmail.com"));
		}
		return false;
	}
	
	

}
