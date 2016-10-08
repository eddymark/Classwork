package chapter7;

import java.util.Arrays;


public class Sort {

	public int[] sort(int[] nums) {
		System.out.println(Arrays.toString(nums));

		for (int x = 0; x < nums.length; x++) {//this loops through all of the numbers 

			for (int y = x + 1; y < nums.length; y++) {// this array 

				if (nums[y] < nums[x]) {
					int temp = nums[x];
					nums[x] = nums[y];
					nums[y] = temp;
				}

			}
			System.out.println(Arrays.toString(nums));

		}
		return nums;

	}

	public static void main(String[] args) {
		int[] nums = {12,33,4,1,3,51,3,4,1,9};
		
		
		 
		Sort s = new Sort();
		s.sort(nums);
	}

}
