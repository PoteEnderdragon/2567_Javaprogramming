import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		int numberOfStudent = scan.nextInt();
		scan.nextLine();
		System.out.println();
		Student[] students = new Student[numberOfStudent];
		
		for (int i=0;i<numberOfStudent;i++) 
		{
			students[i] = new Student();
			System.out.println("INPUT INFORMAION OF STUDENT " + (i+1));
			Line();
			System.out.print("Input student name: ");
			String stdName = scan.nextLine();
			students[i].setName(stdName); //students[i].setName(scan.nextLine());
			System.out.print("Input student score: ");
			int score = scan.nextInt();
			scan.nextLine();			
			students[i].setScore(score);
			while (true) 
			{				
				
				if (students[i].checkScore() == true) {
					break;
				}
				
				else 
				{
				System.out.print("Input score, again: ");				
				score = scan.nextInt();
				scan.nextLine();			
				students[i].setScore(score);				
			    }
		   }
		  System.out.println();
		  
		}
		System.out.println("LIST OF PASS STUDENT (>=50):");
		  Line();
		  for(Student student:students) {
			  if(student.isPass()) {
				  System.out.println(">> "+student.getName()+" ("+student.getScore()+") "
						  + "get grade "+findGrade(student.getScore()));
			  }
		  }
		
		scan.close();
		
	}//end of main method
	
	public static String findGrade(int score) {
		if (score <= 100 && score >= 80) {
			return "A";
		}
		else if (score <= 79 && score >= 75) {
			return "B+";
		}
		else if (score <= 74 && score >= 70) {
			return "B";
		}
		else if (score <= 69 && score >= 65) {
			return "C+";
		}
		else if (score <= 64 && score >= 60) {
			return "C";
		}
		else if (score <= 59 && score >= 55) {
			return "D+";
		}
		else if (score <= 54 && score >= 50) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public static void Line() {
		for(int i =1;i<=60;i++) {
			System.out.print("-");
			
		}
		System.out.println();
	}
	
	

}
