package Chapter6;

public class pokerDemo {

	public static void main(String[] args) {
		// TODO 扑克牌0-51.
		//24:红j，32:方6；39:梅花A
		final int N = 52;
		int[] nums = new int[N];
		String[] pokerColor = {"♠️","♥️","♦️","♣️️"};
		String[] pokerNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i=0 ;i<nums.length;i++) {
			nums[i]=i;
			System.out.printf("%s-%s",pokerColor[i/13],pokerNum[i%13]+"\t");
			if((i+1)%13 == 0)
				System.out.println();
			
		}
		

	}

}
