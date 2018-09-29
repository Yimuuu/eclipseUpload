import java.util.Scanner;

public class ifDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入LV的购买数量:");
		int numLV = input.nextInt();
		System.out.println("输入Hermes的购买数量:");
		int numHer = input.nextInt();
		System.out.println("输入Chanel的购买数量:");
		int numCha = input.nextInt();
		double sumPrice = (numLV * 35000.0 + numHer * 11044.5 + 1534.00 *numCha);
		if ((numLV >1 && numHer >1 && numCha*1535.0 >5000.0) || sumPrice > 3500 )//计算总价折扣
			sumPrice = sumPrice * 0.3;
		else
			sumPrice = sumPrice * 0.8;//如果总价定义为float浮点型：sumPrice = float（sumPrice*0.8）
		System.out.printf("总价是：%.1f",sumPrice);
		
		
		
	}

}
