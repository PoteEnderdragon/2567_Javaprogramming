
public class Student {
	private String studentName;
	private int studentScore;
	
	public void setName(String stdName) {
		studentName = stdName;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	public boolean checkScore() {
		return getScore() <= 100 && getScore()>=0 ? true : false;
	}
	
	public boolean isPass() {
		return getScore() >= 50 ? true : false;
	}

}
