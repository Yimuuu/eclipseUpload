import java.util.Scanner;

public class GallenDemo {
	public static void main(String[] args) {
		System.out.println("生命值：。。。");
		System.out.println("物理攻击：。。");
		Scanner input = new Scanner(System.in);
		double attack = input.nextDouble();
		double attackGrow = input.nextDouble();
		System.out.printf("伤害：\n%.2f(+%.2f)",attack,attackGrow);
		
	}

}
