package hw;

public class ArraySorter {

	public static void selectionSort(int[] anArray) {

		for (int index = 0; index < anArray.length - 1; index++) {
			// places the correct value in anArray[index]
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
		}
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++) {

			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a [startindex] through a[index]

			}
		}
		return indexOfMin;
	}

	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;// sets the original value of a[]i
	}
	
	
		
		
		
}
