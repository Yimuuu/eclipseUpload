package Chapter6;

import java.util.Scanner;

public class serchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)((Math.random()*10000)% 1001);//1-1000随机数
			System.out.println(nums[i] + ",");
		}
		int searchNum = new Scanner(System.in).nextInt();
		int index = -1;
		for(int i = 0; i < nums.length; i++)
			if(searchNum == nums[i]) {
				index = i;
				System.out.println("位置是"+ index);
				break;
		//for (int i : nums) {
			
		//}
			}				
		if(index == -1)
			System.out.println("没有");
			
		

	}

}
