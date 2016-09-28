package classwork;

public class Projectv1 {

	public static void main(String[] args) {
		int prime[];// create the array

		int num = 0;// init the number
		int index = 0; // this is to go through the numbers
		prime = new int[10];// intiailize the array with 10 spaces 0-9

		do {
			if (num / 2 != 0&& num>2) {
				num = prime[num];
				index++;
				System.out.println(index);
				
			}if (index>prime.length){
				break;
			}
			

		} while (true);
		


	}

}
