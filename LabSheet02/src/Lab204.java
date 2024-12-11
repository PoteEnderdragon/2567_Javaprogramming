
import java.util.Scanner;

public class Lab204 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	       
	        System.out.print("Input value of X : ");
	        int X = input.nextInt();
	        System.out.print("Input value of Y : ");
	        int Y = input.nextInt();
	       
	        while(true)
	        {
	           
	            if (Y<X) {
	                System.out.print("Input value of Y, again : ");
	                Y = input.nextInt();
	            }
	            else {
	                break;
	            }
	       
	        }
	        System.out.println();
	       
	        int sum = X + ++X;
	        System.out.println((X-1)+" + " + X + " = "+ sum);
	 
	        while(true) {
	            if (X==Y){
	                break;
	            }
	            ++X;
	            sum = sum + X;
	            System.out.println((sum-X)+" + " + X + " = "+sum);
	 
	        }
	        input.close();

	}

}
