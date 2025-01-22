
public class Rectangle {
	
	/*private float length;
	private float width;
	
	
    //default contrutor
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}*/
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	Rectangle(){};
	
	Rectangle(float length,float width){
		this.length = length;
		this.width = width;
	}
	
	//getter and setter
	public float getLength()
	{
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	//----------------------------------------------------
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//Method to calculate area
	
	public double getArea() {
		return this.length * this.width;
	}
	
	//Method to calculate Parimeter
	
	public double getPerimeter() {
		return 2*(this.length + this.width);
		
	}
	
	public String showData() {
		return "Rectangle[length="+this.length+",width=" + this.width + "]";
	}
	
	public String toString() {
		return "Rectangle[length="+this.length+",width=" + this.width + "]";
	}
}
