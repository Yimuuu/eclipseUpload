package Chapter6;

public class maopaoDemo {

	public static void main(String[] args) {
		// 冒泡
//		1.比较的轮数（外循环）=数组数-1
//		2.每一轮比较的次数=上一轮-1（内循环）
//		3.若前面的比后面的大或小，则交换。
//		两层循环。
		int[] nums = {34,23,431,432,2};
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if(nums[j]<nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;		//j递增，j和j+1比较。不同位置，每次从后往前上浮
					
			}
		}
//		for(int i=0;i<nums.length-1;i++) {
//			for(int j = i+1;j< nums.length; j++) {
//				if(nums[i]<nums[j]) {
//					int temp;
//					temp=nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;			自己写的。。
//				}
				
//			}
		

		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]+"\t");
		}

		
	}

}
