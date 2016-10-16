package chapter7;

public class MethodsA {

	public static void array(int array[]){
		for (int i=0; i<array.length;i++)
			 array[i]+=5;	
		}
	
	
	
	public static void main (String[]args){
		int eddy[]={1,2,3,4,5,6,7,8,};
		
		for (int y:eddy)
			System.out.println("this is the original"+y);
		array(eddy);
		
		
		
		for (int y:eddy)
			System.out.println("this is plus 5"+y);
	}
		
	
}
