package classwork;

public class While {

	public static void main(String[] args) {

		// (1)this is an infinite loop
		// while (true){
		// System.out.println("Hello World");
		// }

		/*
		 * (2)flag boolean flag = true; while (flag){ System.out.println("HI");
		 * if (flag){ break; } }
		 */

		/*
		 * (3)using expressions
		 * 
		 * int i=0; while(i<10){ System.out.println("hi"); i++;
		 * 
		 * }
		 */

		// (4)multiple conditions    infintie loop 

		/*boolean flag = false; 
		int i = 0;
		while (i < 10 || flag) {
			System.out.println("hi");
			if(!flag){
				System.out.println("hello world");
				flag = true;
			}
			i++;
		}*/
		
//		(5) nested loop
		boolean flag = false;
		int i=0;
		while (i<10||flag){
			if (!flag){
				System.out.println("hello");
			}
		}
 

	}

}
