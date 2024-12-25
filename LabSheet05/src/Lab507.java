import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//var
		int[] inputNumber = new int[5];
		for (int i =0 ; i<inputNumber.length;i++) 
		{
		 inputNumber[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) +":"));
		}
		
		showEven(inputNumber);
		showOdd(inputNumber);

	}
	
	public static void showEven(int[] nums) 
	{
		String showEvenNumber = "";
		for (int i =0 ; i<5;i++) 
		{
			if (nums[i]%2 == 0) {
				
				showEvenNumber += nums[i] + " " ;
			}
		}
		JOptionPane.showMessageDialog(null,"List of even number:"+"\n"+showEvenNumber);
	}
	public static void showOdd(int[] nums) 
	{
		String showOddNumber = "";
		for (int i =0 ; i<5;i++) 
		{
			if (nums[i]%2 != 0) {
				
				showOddNumber += nums[i] + " " ;
			}
		}
		JOptionPane.showMessageDialog(null,"List of odd number:"+"\n"+showOddNumber);
	}

}
