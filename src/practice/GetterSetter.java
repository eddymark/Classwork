package practice;

public class GetterSetter {

	//attributes
	
	private double length=0;
	private double width=0;
	
	
	
	
	
	
	//methods
	
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double len){
		length = len;
	}
	
	public void setWidth(double w){
		width = w;
	}
	
	public double GetArea(){
		return length*width;
	}
}
