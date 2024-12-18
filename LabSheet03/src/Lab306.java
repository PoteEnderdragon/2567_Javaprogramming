import java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 
        //variable
        String inputMessage;
        int countNichi = 0;
 
        //input
        System.out.print("Message: ");
        inputMessage = scan.nextLine();
        if (inputMessage.toLowerCase().indexOf("nichi")>=0) {
            countNichi++;
 
        }
       
        if (countNichi > 0) {
            System.out.println("Nichi is a sentence");
        }
        else {
            System.out.println(inputMessage);
        }
 
 
       
        scan.close();

	}

}
