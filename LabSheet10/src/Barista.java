
public class Barista {
	private String name;
	private char gender;
	
	Barista(String name,char gender) {
		this.name = name;
		this.gender = gender;
	}
	Barista(){
		this(" ",' ');
	}
	
	public String getName() {
		return this.name; //?
	}
	public String getGenderName() {
		if(gender == 'm' || gender == 'M') {
			return "Male";
		}
		else if (gender == 'f' || gender == 'F') {
			return "Female";
		}
		return " ";
	}

}
