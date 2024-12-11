import javax.swing.*;

public class Lab302_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean chkEmail = false;
		String inputEmail;
		
		//while(inputEmail.startsWith("@")|| inputEmail.contains(" ")) {
			//inputEmail = JOptionPane.showInputDialog("Input your email,again:");
			
		
		while(true) 
		{
			inputEmail = JOptionPane.showInputDialog("Input your email:").toLowerCase();
			while(inputEmail.startsWith("@")|| inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your email,again:");
			}//end of while
			chkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
			if (chkEmail) 
			{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
			break;
		    }
		    else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			continue;
		    }
		}
		
		

	}

}
