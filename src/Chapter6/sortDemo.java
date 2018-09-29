package Chapter6;

import java.util.Arrays;

public class sortDemo {
	public static void main(String[] args) {
		final int N = 500;
		int[] nums = new int[N];
		for (int j = 0; j < nums.length; j++) {
			nums[j] = (int)(Math.random()*10000);
		}
		Arrays.sort(nums);//自动排序升序
		//逆序：首位交换。
		for (int i = 0; i < nums.length; i++) {
//		for (int i = 0; i < nums.length; i++) {	
//			int temp = nums[i];
//			nums[i] = nums[nums.length-i-1];首尾交换
			System.out.print(nums[i]+",");
		}

	}

}
