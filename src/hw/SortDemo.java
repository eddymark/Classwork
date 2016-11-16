package hw;

public class SortDemo {

	public static void main(String[] args) {
		int []b={1,2,4,7,98,43,6};
		
		display(b,"before");
		ArraySorter.selectionSort(b);
		display(b,"after");
		
		
	}
	public static void display(int[] array,String when){
		System.out.println("array values "+when+" sorting:");
		for(int i =0; i<array.length; i++)
			System.out.print(array[i]+" ");
			System.out.println( );
		
		
	}

}
