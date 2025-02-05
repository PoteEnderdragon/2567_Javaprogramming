
public class Theater extends Movie{
	private int theaterNo;
	
	Theater(String id,String name,Director director,int theaterNo) {
		
	}
	Theater(){
		
	}
	public String getTheaterName() {
		return "";
	}
	public String toString() {
		return getTheaterName() + ": " + super.toString();
	}

}
