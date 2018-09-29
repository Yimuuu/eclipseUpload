package Chapter6;

import java.util.Scanner;

public class erfenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,34,56,324,525,723};
		Scanner input = new Scanner(System.in);
		System.out.println("输入");
		int searchNum = input.nextInt();
		int low = 0;
		int high = nums.length-1;
		Boolean isfind = false;
		while(high >= low) {
			int mid = (high+low)/2;
			if(searchNum < nums[mid])
				high = mid-1;
			else if (searchNum >nums[mid])
				low = mid+1;
			else {
				System.out.println("Bingo！在第" + mid + "上，值为" + nums[mid]);
				isfind = true;
				break;	
			}
		}
		if(!isfind )
			System.out.println("没有" +searchNum);

	}

}
