package Chapter6;

public class xuanzeDemo {
	public static void main(String[] args) {
		int [] nums = {2,42,123,123,4,2,2,14,69};
		for(int i = 0; i< nums.length; i++) {
			int min = nums[i];
			int minIndex = i;
			for(int j = i+1; j < nums.length; j++) {
				if(min > nums[j]) {
					min = nums[j];
					minIndex = j;//取最小值
			int temp =nums[i];
			nums[i] = min;
			nums[minIndex]=temp;				//循环外		
				}
			}
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]+"\t");
		}
	}

}
