package chapter7;



public class Search {

	public boolean search(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(arr[i]);
				return true;
			}

		}
		return false;
	}
	

}
