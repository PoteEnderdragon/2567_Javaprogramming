import java.util.*;
public class Lab303 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	       
        //var
        int spacebarCount = 0;
        int wordCount = 0;
        String inputSentence;
       
        System.out.print("Input a sentence : ");
        inputSentence = scan.nextLine();
        while(true)
        {
            if (inputSentence.endsWith("."))
            {
            break;
            }
            else {
            System.out.print("Input a sentence, again : ");
            inputSentence = scan.nextLine();
               
            }
       
        }//end of while01
        System.out.println();
        for (int i =0;i<inputSentence.length()-1;i++)
        {
                char ch = inputSentence.charAt(i);
                if (ch == ' ')
                {
                    spacebarCount++;
                }
        }
       
        String text[] = inputSentence.split(" ");
        for (int i=0;i<text.length;i++){
            wordCount++;
        }
        System.out.println("This sentence has "+spacebarCount+" spacebar.");
        System.out.println("This sentence has "+wordCount+" word.");
 
        scan.close();
		

	}

}
