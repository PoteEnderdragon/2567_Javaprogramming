

public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fName;
	private String lName;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fName = author_name.substring(0,space);
		lName = author_name.substring(space+1);
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getEmail() {
		return this.email;
	}
	public String getLastName() {
		return this.lName.toUpperCase();
	}
	public String getFirstName() {
		return this.fName.toUpperCase();
	}
	public boolean checkEmail() {
		if (this.email.endsWith("@hotmail.com") || this.email.endsWith("@windowslive.com") ) {
			return true;
		}
		return false;
	}
	public String getTitle() {
		return this.title;
	}
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	public String toString() {
		return  getTitle() +
				" write by " + getLastName().substring(0,1)+
				"." + getFirstName() +
				"(" + getEmail() + ")" + 
				"\nPublished for " + totalPublicYear() + " year(s).";		
	}

}
