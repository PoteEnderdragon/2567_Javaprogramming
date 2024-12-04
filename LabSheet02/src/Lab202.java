import java.util.*;
public class Lab202 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		int presentNumber;
		int pastNumber;
		System.out.print("Input number : ");
		presentNumber = input.nextInt();
		while(true)
		{
			pastNumber = presentNumber;
			System.out.print("Input number : ");
			presentNumber = input.nextInt();
			
		    if (presentNumber < pastNumber) 
			{
				break;
			}
		}
		System.out.println();
		System.out.println("BYE BYE");

	}

}
