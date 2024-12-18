import java.util.*;
public class Lab403 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fullname; //ป้อนชื่อแรก
		String firstname; //เอา fullname มาใส่
		
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullname = input.nextLine();
		
		int space = fullname.indexOf(" ");
		firstname = fullname.substring(0,space);
		
		//to get middle name
		System.out.println(abbreviatName(fullname)+firstname);
		
		
		
		
		input.close();

	}
	public static String abbreviatName(String fName) 
	{
		String initailLetter="";
		
		for(int i = 0;i<fName.length();i++) {
			if (fName.charAt(i)== ' ') {
				initailLetter = (initailLetter + fName.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter + ".";
			}
		}
		return initailLetter;
	}

}
