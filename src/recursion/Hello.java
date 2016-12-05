package recursion;

public class Hello {

	public static void sayHello(int count) {
		if (count == 0) {
			System.out.println("Done!");
		} else {
			System.out.println(count+" Hello");
			count--;
			sayHello(count);
			
			System.out.println("rewinding"+count);
		}

	}

	public static void fibonacci(int count) {
		if (count > 0) {
			int n3 = 0;
			int n2 = 1;
			int n1 = 0;
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" "+n3);
			System.out.println(n1+" " +n2);
			fibonacci(count-1);
			
			
		}
	}

	public static void main(String[] args) {

		sayHello(10);
		
		
//		fibonacci(2);
	}

}
