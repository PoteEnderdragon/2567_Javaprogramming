import java.util.Scanner;
public class Lab102 {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
	final int convertMinuteToYear = 525600;
        final int convertMinuteToDay = 1440;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int minutes = scan.nextInt();
        int year = minutes / convertMinuteToYear;
        int left =  minutes - (convertMinuteToYear * year) ;
        int day = left / convertMinuteToDay;
        System.out.println(minutes + " minutes is approximately " + year +" years and " + day + " days");
 
        scan.close();
	}

}
