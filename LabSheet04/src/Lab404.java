import java.util.*;
public class Lab404 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		inputStudent();

	}//End of main method
	public static void inputStudent() 
	{
		Scanner scanner = new Scanner(System.in);
		String studentID,subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while (true) {
			//input student ID
			System.out.print("Enter student ID (10 digits) : ");
			studentID = scanner.nextLine();
			
			//input subject code
			System.out.print("Enter subject code (7 digits) : ");
			subjectCode = scanner.nextLine();
			
			isStudentIDValid = isLength(studentID , 10);
			isSubjectCodeValid = isLength(subjectCode , 7);
			
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				
				System.out.print("\nStudent id: " + studentID + " ");

				displayData(isITStudent,isITSubject);
				break;
			}
			else {
				System.out.print("");
			}
		}//end of while loop
	
	}//End of inputStudent method
	
	public static boolean isLength(String input,int length) 
	{
		//if 
		
		return input.length() == length;
	}//End of isLength
	
	public static boolean isITStudent(String ID) {
		
			
			if (ID.substring(0,7) == "211311" ) {
				return true;
			}
			
			
		
		return false;
	}//End of isITStu
	public static boolean isITSubject(String Code) {
		if (Code.substring(0,2) == "21" && Code.substring(5)== "1" ) {
			return true;
		}
		return false;
	}//End of isITSub
	
	public static void displayData(boolean StuId,boolean SubC)
	{
		if (StuId = true) {
			System.out.print("1st year student in IT");
		}
		else {
			System.out.print("is not 1st year student in IT");
		}
		if (SubC = true) {
			System.out.print("\nEnroll in courses for Year 1");
		}
		else {
			System.out.print("\nnot enroll in courses for Year 1");
		}
		
		
	}
	//ยังไม่เสร็จ

}
