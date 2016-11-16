package Midterm;

public class Midterm {
	
	public static void question1a(){
		String android="Nougat";
		System.out.println(android.indexOf("Nougat"));
	}
	
	public static void ex1(){
		String android= "nougat";
		System.out.println(android.substring(0,2));
	}
	//if the index of that number or letter doesnt exist it will give you a negative 1
	//indexOf gets it where it starts
	
	public static void question1b(){
		int a=5;
		while(a>0){
			if (a%3==0){
				System.out.println("fun a="+a);
			}
			else if(a%2==0){
				System.out.println("boring a="+a);
				
			}else
				System.out.println("yikes");
			
			a--;
		}
		
	}
	
	public static void question1c(){
		for (int i =3; i<10; i=i+2){
			int j=i+1;
			System.out.println(i*j);
		}
	}
	
	public static void alphabet(){
		for (int i = 65; i < 91; i++) {
			System.out.print(Character.toString((char)i));
			
		}
	}
	
	public static void printPattern(){
		String pattern = "#####";
		int i=0;
		while(i<pattern.length()){
			System.out.println(pattern.substring(0, i+1));
			i++;
		}
		
	}

	

	public static void main(String[] args) {
//		question1a();
//		ex1();
//		question1b();
//		question1c();
		printPattern();
		alphabet();

	}

}
