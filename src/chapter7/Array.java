package chapter7;

public class Array {
	
	public boolean equal (int[]arr1, int[] arr2){
		
		if (arr1.length!=arr2.length){
			return false;
		}
		for (int i=0; i<arr1.length;i++){
			if (arr1[i]!=arr2[i]){
				return false;
			}
		
		}
		System.out.println("the numbers are equal ");
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums ={1,2,3,4,5};
		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		Array st = new Array();
		st.equal(nums, arr);
		
		
	}

}
