import java.io.*;
import java.util.*;
public class Lab1101 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Input section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		

	}
	
	public static void printHeader(int sec) {
		System.out.println("***********************************************************");
		System.out.println("\tList of Data for Section "+ sec);
		System.out.println("***********************************************************");
	}
	
	public static void displayStudentList(int section) throws IOException 
	{
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtfile//List107.txt"))) {
			String temp= "";
			while( (temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				
				if (data.length < 6) continue; //ทำให้ทำงานต่อได้ โดยไม่ Error
				
				int studentSection = Integer.parseInt(data[3]); //แปลงกลุ่มเรียนในfileให้เป็น int จาก dataที่เป็น String
				
				if (studentSection == section) {
					double midTerm = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					//determineResult(midTerm,finalScore);
					System.out.printf("%s %s \t%.2f \t%.2f %s%n",data[0],data[2],midTerm,finalScore,determineResult(midTerm,finalScore));
				}
			}
		}
	}
	
	public static String determineResult(double mid,double fin) {
		return (mid + fin) >= 40 ? "Pass" : "Fail";
	}
}
    
