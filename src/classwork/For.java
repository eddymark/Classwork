package classwork;

public class For {

	public static void main(String[] args) {

		/*
		 * //(1) for loop
		 * 
		 * for (int i = 0; i<10; i++){ System.out.println("Hello -" +i); }
		 */
		/*
		 * (2)for nothing infinite
		 * 
		 * for (;;){ System.out.println("Hello"); }
		 */
		
//		(3) for each
		
		String[] items = {"one","two","three","four","five"}; //an array
		
		for (String things : items){
			System.out.println(things);
		}

	}

}
