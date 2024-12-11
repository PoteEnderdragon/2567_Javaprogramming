import javax.swing.*;

public class Lab302 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your email:").toLowerCase();
		//boolean validateEmail  = false;
		//validateEmail = inputEmail.startsWith("@")|| inputEmail.contains(" ");
		while(inputEmail.startsWith("@")|| inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your email,again:");
		}
		if (inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
		

	}

}
