package Chapter5;

import java.util.Scanner;

public class guessPrize {
	//模（%）9=的范围是，0-8之间；再+1就是：1-9之间
	public  static void main(String[] args) {
		int count = 0;
		int guessPrize = -1;
		boolean button = false;
		int Prize = (int)((Math.random() * 10000) % 9 +1)*1000;//1000-9000
		System.out.println("幸运53猜商品价格游戏！");
		for(int i = 1;i <= 5;i++) {
			System.out.println("请输入价格！第("+ ++count +")次尝试");
			Scanner input = new Scanner(System.in);			
			guessPrize = input.nextInt();
			if (guessPrize == Prize) {
				button = true;
				if(1 == count) {
					System.out.println("一次就猜对了！一等奖🥇");					
				}
				else if(2<= count && 3>= count) {
					System.out.println("猜对！二等奖🥈");					
				}
				else
					System.out.println("三等奖🥉");
				break;
			}
			else if(guessPrize > Prize)
				System.out.println("猜错了，你猜大了！还有"+ (5-count)+"次机会");
			else 
				System.out.println("猜错了，你猜小了！还有"+ (5-count)+"次机会");
		}
			if (button == false)
				System.out.println("一次都没猜对，机会用完！");
			else
				System.out.println("去领奖吧！");
					
	}

}
